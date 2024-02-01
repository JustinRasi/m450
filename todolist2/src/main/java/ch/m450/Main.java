package ch.m450;

import ch.m450.model.Category;
import ch.m450.model.Task;
import ch.m450.model.User;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Category shopping = new Category("Shopping");
        Category work = new Category("Work");

        User john = new User("John", 30);
        User jane = new User("Jane", 25);

        Task task1 = new Task("Buy cocaine", false, LocalDateTime.of(2024, 2, 1, 11, 0));
        task1.setCategory(shopping);
        task1.setUser(john);

        //Task task2 = new Task("Call boss", false);
        //task2.setCategory(work);
        //task2.setUser(jane);
        //task2.setCompleted(true);

        System.out.println("Task: " + task1.getDescription());
        System.out.println("Category: " + task1.getCategory().getName());
        System.out.println("Completed: " + task1.isCompleted());
        System.out.println("User: " + task1.getUser().getUsername());
        System.out.println("Is overdue: " + task1.isOverdue());

        //System.out.println("Task: " + task2.getDescription());
        //System.out.println("Category: " + task2.getCategory().getName());
        //System.out.println("Completed: " + task2.isCompleted());
        //System.out.println("User: " + task2.getUser().getUsername());


        //System.out.println(todoList.task1.getDescription());
        //todoList.getTask2().setCompleted(false);
        //System.out.println(todoList.task2.isCompleted());
    }
}
