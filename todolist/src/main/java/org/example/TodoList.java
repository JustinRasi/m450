package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Category> categories;

    public TodoList() {
        this.categories = new ArrayList<>();
    }

    public void createCategory(String categoryName) {
        Category category = new Category(categoryName);
        categories.add(category);
        System.out.println("Category created successfully.");
    }

    public void showCategories() {
        System.out.println("Categories:");
        for (Category category : categories) {
            System.out.println(category.getName());
            category.showTasks();
            System.out.println();
        }
    }

    public void deleteCategory(String categoryName) {
        categories.removeIf(category -> category.getName().equalsIgnoreCase(categoryName));
        System.out.println("Category deleted successfully.");
    }

    public void addTaskToCategory(String categoryName, String taskName) {
        Category category = findCategory(categoryName);

        if (category != null) {
            Task task = new Task(taskName);
            category.addTask(task);
            System.out.println("Task added to the category successfully.");
        } else {
            System.out.println("Category not found. Please try again.");
        }
    }

    private Category findCategory(String categoryName) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }
        return null;
    }
}
