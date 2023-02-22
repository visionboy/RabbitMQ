package com.rbmq.example.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiApplication.class, args);
	}

}
