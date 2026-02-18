package com.example;

import com.example.service.TaskService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    void shouldCreateTaskSuccessfully() {
        TaskService service = new TaskService();
        var task = service.createTask("Test Task");

        assertNotNull(task.getId());
        assertEquals("Test Task", task.getTitle());
        assertFalse(task.isCompleted());
    }

    @Test
    void shouldMarkTaskAsCompleted() {
        TaskService service = new TaskService();
        var task = service.createTask("Complete me");

        service.markTaskCompleted(task.getId());

        assertTrue(task.isCompleted());
    }

    @Test
    void shouldThrowExceptionWhenTaskNotFound() {
        TaskService service = new TaskService();

        assertThrows(RuntimeException.class, () -> 
            service.markTaskCompleted("invalid-id"));
    }
}
