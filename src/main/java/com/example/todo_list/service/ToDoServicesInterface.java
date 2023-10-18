package com.example.todo_list.service;

import com.example.todo_list.model.ToDo;

import java.util.List;

public interface ToDoServicesInterface {

    ToDo create(ToDo todo);
    ToDo update(ToDo todo);

    List<ToDo> getAll();

    ToDo getById(long id);

    void deleteById(long id);

}
