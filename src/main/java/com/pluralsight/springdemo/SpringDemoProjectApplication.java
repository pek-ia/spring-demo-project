package com.pluralsight.springdemo;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDemoProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoProjectApplication.class, args);
	}

	@Autowired
	DealershipRepository drepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World - Here are my dealerships!");

		Iterable<Dealership> dealerships = drepo.findAll();

		for(Dealership d: dealerships){
			System.out.printf("""
					Dealership:
					  id: %d
					  name: %s
					  address: %s
					  phone: %s
					""",
					d.getDealership_id(), d.getName(), d.getAddress(), d.getPhone());

		}

	}
}
