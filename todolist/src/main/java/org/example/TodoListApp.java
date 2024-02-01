package org.example;

public class TodoListApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.createCategory("Personal");
        todoList.createCategory("Work");

        todoList.addTaskToCategory("Personal", "Buy groceries");
        todoList.addTaskToCategory("Work", "Finish report");

        todoList.showCategories();
    }
}
