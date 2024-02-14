package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.util.HibernateUtil;

@RestController
@SpringBootApplication
public class MainApplication {

	@GetMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		SpringApplication.run(MainApplication.class, args);
	}

}
