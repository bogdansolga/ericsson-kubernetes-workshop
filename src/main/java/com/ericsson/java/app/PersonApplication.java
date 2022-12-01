package com.ericsson.java.app;

import com.ericsson.java.app.domain.Person;
import com.ericsson.java.app.repository.PersonRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(PersonRepository personRepository) {
		return args -> {
			personRepository.save(new Person("John", "Doe"));
			personRepository.save(new Person("Jane", "Doe"));
		};
	}
}
