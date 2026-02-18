package com.example.model;

import java.time.LocalDate;
import java.util.UUID;

public class Task {

    private final String id;
    private String title;
    private boolean completed;
    private final LocalDate createdDate;

    public Task(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.completed = false;
        this.createdDate = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                ", createdDate=" + createdDate +
                '}';
    }
}
