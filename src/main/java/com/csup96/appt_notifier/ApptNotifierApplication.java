package com.csup96.appt_notifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
@EnableScheduling
@SpringBootApplication
public class ApptNotifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApptNotifierApplication.class, args);
	}

}