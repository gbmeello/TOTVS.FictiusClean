package com.TOTVS.FictiusClean;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class Application {

	
		
		@PostConstruct
	    void started() {
	      TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
	    }

		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}

		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(Application.class);
		}
		
	}