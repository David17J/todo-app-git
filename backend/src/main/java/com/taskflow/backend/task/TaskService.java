package com.taskflow.backend.task;

import com.taskflow.backend.person.Person;
import com.taskflow.backend.person.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {

    private final TaskRepository taskRepository;

    private final PersonRepository personRepository;

    public TaskService(TaskRepository taskRepository, PersonRepository personRepository) {
        this.taskRepository = taskRepository;
        this.personRepository = personRepository;
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
    Task task = taskRepository.findById(id)
            .orElseThrow(() -> new TaskNotFoundException(id));

        task.setTitle(updatedTask.getTitle());
        task.setCompleted(updatedTask.isCompleted());

        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));

        taskRepository.delete(task);

    }
        public Task assignPersonToTask(Long taskId, Long personId) {

        Task task = taskRepository.findById(taskId)
                .orElseThrow();

        Person person = personRepository.findById(personId)
                .orElseThrow();

        task.setPerson(person);

        return taskRepository.save(task);
    }



}
