package com.example.condidatt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CondidattApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondidattApplication.class, args);
	}


	@Autowired
	private CandidatRepository repository;
	@Bean
	ApplicationRunner init(){
		return (args) -> {
			repository.save(new Candidat(1,"emna","ayachi","ayachi.emna@esprit.tn"));
			repository.save(new Candidat(2,"yasmin","ayachi","ayachi.yasmin@esprit.tn"));
			repository.save(new Candidat(3,"lilia","ayachi","ayachi.lilia@esprit.tn"));

			repository.findAll().forEach((System.out::println));

		};
	}
}
