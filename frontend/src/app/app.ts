import { Component, OnInit, signal } from '@angular/core';
import { TaskService } from './services/task.service';
import { Task } from './models/task';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {

  tasks = signal<Task[]>([]);

  constructor(private taskService: TaskService) {
  }

  ngOnInit(): void {
    this.taskService.getTasks().subscribe(tasks => {
      this.tasks.set(tasks);
    });
  }

  addTask(title: string): void {
    if (!title.trim()) {
      return;
    }
    const newTask = {
      title: title,
      completed: false
    };
    this.taskService.createTask(newTask).subscribe(createTask => {
      this.tasks.update(tasks => [...tasks, createTask]);
    });
  }

  deleteTask(id: number): void {

    this.taskService.deleteTask(id).subscribe(() => {
      this.tasks.update(tasks =>
          tasks.filter(task => task.id !== id)
        // Task aus unserem tasks-Signal entfernen
      );
    });
  }
}
