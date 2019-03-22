package com.sykj.htingpj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HtingpjApplication extends SpringBootServletInitializer{
	//jar
	public static void main(String[] args) {
		SpringApplication.run(HtingpjApplication.class, args);
	}
	
	//war
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HtingpjApplication.class);
	}
}
