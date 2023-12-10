package com.housni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/**
	 * Main method is the entry point of the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// add constructor to the class
	public DemoApplication() {
		System.out.println("DemoApplication class is created");
	}

}
