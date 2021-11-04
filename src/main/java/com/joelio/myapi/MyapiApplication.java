package com.joelio.myapi;

import com.joelio.myapi.Domain.User;
import com.joelio.myapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "joelio Marinho", "joelio", "1234");

		User u2 = new User(null, "maria bela", "maria ", "123");

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
