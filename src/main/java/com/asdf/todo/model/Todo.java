package com.asdf.todo.model;

import lombok.*;

public class Todo {
    private Long id;
    @NonNull
    private String title;
    private String description;
    private boolean completed;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
}
