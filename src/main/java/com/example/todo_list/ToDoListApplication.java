package com.example.todo_list;

import com.example.todo_list.Entity.User;
import com.example.todo_list.Entity.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user=new User();
		user.setId(1L);
		user.setPassword("1234567890");
		user.setUsername("Aakarsh");

		Todo todo=new Todo();
		todo.setId(1L);
		todo.setDetails("Do my homework");

		user.getTodoList().add(todo);

	}
}
