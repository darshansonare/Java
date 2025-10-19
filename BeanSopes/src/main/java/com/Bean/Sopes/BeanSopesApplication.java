package com.Bean.Sopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanSopesApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BeanSopesApplication.class, args);
		
		
	     MySingletonBean s1 = context.getBean(MySingletonBean.class);
	        MySingletonBean s2 = context.getBean(MySingletonBean.class);

	        System.out.println("Singleton Beans:");
	        System.out.println("s1 hashCode: " + s1.hashCode());
	        System.out.println("s2 hashCode: " + s2.hashCode());
	        System.out.println("Same instance? " + (s1 == s2));
	        System.out.println("---------------------------------");

	        // Prototype Bean
	        MyPrototypeBean p1 = context.getBean(MyPrototypeBean.class);
	        MyPrototypeBean p2 = context.getBean(MyPrototypeBean.class);

	        System.out.println("Prototype Beans:");
	        System.out.println("p1 hashCode: " + p1.hashCode());
	        System.out.println("p2 hashCode: " + p2.hashCode());
	        System.out.println("Same instance? " + (p1 == p2));

	        context.close();
	}
	
	

}
