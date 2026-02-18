package com.example.service;

import com.example.model.Task;

import java.util.*;

public class TaskService {

    private final Map<String, Task> taskStore = new HashMap<>();

    public Task createTask(String title) {
        Task task = new Task(title);
        taskStore.put(task.getId(), task);
        return task;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskStore.values());
    }

    public Task markTaskCompleted(String id) {
        Task task = taskStore.get(id);
        if (task == null) {
            throw new NoSuchElementException("Task not found");
        }
        task.markCompleted();
        return task;
    }

    public Optional<Task> getTaskById(String id) {
        return Optional.ofNullable(taskStore.get(id));
    }
}
