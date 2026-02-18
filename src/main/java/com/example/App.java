package com.example;

import com.example.service.TaskService;

public class App {

    public static void main(String[] args) {

        TaskService service = new TaskService();

        var task1 = service.createTask("Learn GitHub Actions");
        var task2 = service.createTask("Build Docker Pipeline");

        service.markTaskCompleted(task1.getId());

        service.getAllTasks().forEach(System.out::println);
    }
}
