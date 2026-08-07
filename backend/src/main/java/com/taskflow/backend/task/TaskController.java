package com.taskflow.backend.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public Task getTasks() {
        return new Task(1L,  "Task1", false) ;
    }
}

