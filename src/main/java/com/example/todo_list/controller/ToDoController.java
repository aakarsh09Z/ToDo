package com.example.todo_list.controller;

import com.example.todo_list.model.ToDo;
import com.example.todo_list.service.ToDoServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
public class ToDoController {

    @Autowired
    private ToDoServicesInterface todoService;
    @GetMapping("/todo")
    ResponseEntity<List<ToDo>>getAll()
    {
        return ResponseEntity.ok().body(todoService.getAll());
    }

    @GetMapping("/todo/{Id}")
    ResponseEntity<ToDo>getById(@PathVariable long Id)
    {
        return ResponseEntity.ok().body(todoService.getById(Id));
    }

    @PostMapping("/todo")
    public ResponseEntity<ToDo> create(@RequestBody ToDo todo)
    {
        return ResponseEntity.ok().body(this.todoService.create(todo));
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<ToDo> update(@PathVariable long id,@RequestBody ToDo todo)
    {
        todo.setId(id);
        return ResponseEntity.ok().body(this.todoService.update(todo));
    }

    @DeleteMapping("/todo/{id}")
    public HttpStatus deleteById(@PathVariable long id )
    {
        this.todoService.deleteById(id);
        return HttpStatus.OK;
    }

}
