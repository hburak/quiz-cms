package com.hburak.projects.quizcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class QuizCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizCmsApplication.class, args);
	}

}
