package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Task> tasks;

    public Category(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in this category.");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println("- " + task.getName());
            }
        }
    }
}
