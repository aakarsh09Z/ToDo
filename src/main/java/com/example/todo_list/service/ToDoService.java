package com.example.todo_list.service;

import com.example.todo_list.model.ToDo;
import com.example.todo_list.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService implements ToDoServicesInterface{


    @Autowired
    private ToDoRepository todoRepo;

    public ToDoService(ToDoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public ToDo create(ToDo todo) {
        return todoRepo.save(todo);
    }

    @Override
    public ToDo update(ToDo todo) {
        Optional<ToDo> todoDB=this.todoRepo.findById(todo.getId());
        if(todoDB.isPresent()){
            ToDo todoUpdate = todoDB.get();
            todoUpdate.setId(todo.getId());
            todoUpdate.setName(todo.getName());
            todoUpdate.setDescription(todo.getDescription());
            todoRepo.save(todoUpdate);
            return todoUpdate;
        }
        else return null;
    }

    @Override
    public List<ToDo> getAll() {
        return this.todoRepo.findAll();
    }

    @Override
    public ToDo getById(long id) {
        Optional<ToDo> todoDB = this.todoRepo.findById(id);
        return todoDB.orElse(null);
    }

    @Override
    public void deleteById(long id) {
        Optional<ToDo> todoDB = this.todoRepo.findById(id);
        todoDB.ifPresent(notes -> this.todoRepo.delete(notes));
    }
}
