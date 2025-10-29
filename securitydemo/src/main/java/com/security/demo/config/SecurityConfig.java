package com.security.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    //userDetailsService is interface
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        //UserDetails this  is object
        UserDetails user= User.withUsername("darshan")
                .password(encoder.encode("134"))
                .roles("User")
                .build();

        UserDetails admin=User.withUsername("admin")
                .password((encoder.encode("admin123")))
                .roles("Admin")
                .build();
        return new InMemoryUserDetailsManager(user,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf->csrf.disable())
        .authorizeHttpRequests(auth->auth
                .requestMatchers("/public").permitAll()
                .requestMatchers("/admin").hasRole("Admin")
                .requestMatchers("/user").hasRole("User")
                .anyRequest().authenticated()

        )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .logout(Customizer.withDefaults());

        return http.build();
    }

}
