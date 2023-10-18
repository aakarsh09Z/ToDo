package com.example.todo_list.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    private Long id;
    private String details;
    private Boolean completed= Boolean.FALSE;

    public Todo() {
    }

    public Todo(Long id, String details, Boolean completed) {
        this.id = id;
        this.details = details;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
