package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com/csi"})
public class SpringBootCore1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCore1Application.class, args);
	}

}
