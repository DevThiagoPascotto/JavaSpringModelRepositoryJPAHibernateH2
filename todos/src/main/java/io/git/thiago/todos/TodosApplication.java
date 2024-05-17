package io.git.thiago.todos;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.git.thiago.todos.repository.TodoRepository;
import io.git.thiago.todos.model.Todo;


@SpringBootApplication

public class TodosApplication {
	
	@Autowired
	private TodoRepository todoRepository;
	
	
	
	@Bean
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Todo x = new Todo();
				
				x.setDescripition("Ola");
				x.setDone(true);
				todoRepository.save(x);
			}
		};
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

}
