package com.example.springbootjournal;

import com.example.springbootjournal.domain.Journal;
import com.example.springbootjournal.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJournalApplication {

	@Bean
	InitializingBean saveData (JournalRepository repository){
		return () -> {
			repository.save(new Journal("Get to know Springboot", "Today i will learn spring boot", "01/01/2022"));
			repository.save(new Journal("Simple springboot project", "I will create my first springboot project", "02/01/2022"));
			repository.save(new Journal("Springboot reading", "Read more about Spring boot and java", "03/01/2022"));
			repository.save(new Journal("Spring boot in the cloud", "Learning more about springboot foundry", "04/01/2022"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJournalApplication.class, args);
	}

}
