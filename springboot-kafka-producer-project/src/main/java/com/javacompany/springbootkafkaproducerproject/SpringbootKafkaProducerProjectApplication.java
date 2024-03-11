package com.javacompany.springbootkafkaproducerproject;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringbootKafkaProducerProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaProducerProjectApplication.class, args);
	}

	@Autowired
	private Producer producer;

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage();
	}

}
