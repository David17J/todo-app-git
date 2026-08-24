package com.taskflow.backend.repository;

import com.taskflow.backend.task.Task;
import com.taskflow.backend.task.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class TaskRepositoryTest {
    @Autowired
    private TaskRepository taskRepository;

    @Test
    void shouldSaveTask(){
    // Arrange preparing dummy data
        Task task = new Task();
        task.setTitle("Test Task");
        task.setCompleted(false);

    // Act chosen function
        Task savedTask = taskRepository.save(task);

    // Assert checking result
        assertNotNull(savedTask.getId());
    }

    @Test
    void shouldFindTaskById() {
        // Arrange
        Task task = new Task();
        task.setTitle("Find me");
        task.setCompleted(false);

        Task savedTask = taskRepository.save(task);

        // Act
        Task foundTask = taskRepository.findById(savedTask.getId())
                .orElse(null);

        // Assert
        assertNotNull(foundTask);
        assertEquals("Find me", foundTask.getTitle());
    }
}