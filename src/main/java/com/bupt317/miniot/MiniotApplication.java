package com.bupt317.miniot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniotApplication {

	public static void main(String[] args) {
        System.out.println("Minimized Internet of Things");
		SpringApplication.run(MiniotApplication.class, args);
	}

}
