package com.airline.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.airline")
@EntityScan("com.airline.model")
@PropertySource("classpath:application.properties")
public class AirlineAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineAppApplication.class, args);
	}
}
