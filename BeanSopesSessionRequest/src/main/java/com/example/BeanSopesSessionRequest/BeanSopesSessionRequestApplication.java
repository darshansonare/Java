package com.example.BeanSopesSessionRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class BeanSopesSessionRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanSopesSessionRequestApplication.class, args);
	}
	
	  @Bean
	    public RequestContextListener requestContextListener() {
	        return new RequestContextListener();
	    }

}
