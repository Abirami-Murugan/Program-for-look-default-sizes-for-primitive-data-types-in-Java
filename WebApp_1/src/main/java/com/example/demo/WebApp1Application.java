package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		
		SpringApplication.run(WebApp1Application.class, args);
		
		Home home = context.getBean(Home.class);
		home.display();
	}

}
