package com.example.todo_list.repository;

import com.example.todo_list.model.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo,Long> {

}
