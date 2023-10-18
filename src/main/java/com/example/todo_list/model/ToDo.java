package com.example.todo_list.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="ToDo")
public class ToDo {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    @CreationTimestamp
    private LocalDate ToDoCreatedOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getToDoCreatedOn() {
        return ToDoCreatedOn;
    }

    public void setToDoCreatedOn(LocalDate toDoCreatedOn) {
        ToDoCreatedOn = toDoCreatedOn;
    }
}
