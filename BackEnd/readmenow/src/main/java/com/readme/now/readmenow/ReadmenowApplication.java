package com.readme.now.readmenow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ReadmenowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadmenowApplication.class, args);
	}

}
