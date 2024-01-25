package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TodoList {
    private Map<String, ArrayList<Task>> categories;

    public TodoList() {
        categories = new HashMap<>();
    }

    public void addCategory(String categoryName) {
        categories.put(categoryName, new ArrayList<>());
        System.out.println("Kategorie hinzugefügt: " + categoryName);
    }

    public void addTask(String categoryName, String taskDescription) {
        if (categories.containsKey(categoryName)) {
            Task newTask = new Task(taskDescription);
            categories.get(categoryName).add(newTask);
            System.out.println("Aufgabe hinzugefügt (" + categoryName + "): " + taskDescription);
        } else {
            System.out.println("Kategorie nicht gefunden: " + categoryName);
        }
    }

    public void viewTasks(String categoryName) {
        if (categories.containsKey(categoryName)) {
            ArrayList<Task> tasks = categories.get(categoryName);
            if (tasks.isEmpty()) {
                System.out.println("Keine Aufgaben in der Kategorie " + categoryName + ".");
            } else {
                System.out.println("Aufgaben in der Kategorie " + categoryName + ":");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
                }
            }
        } else {
            System.out.println("Kategorie nicht gefunden: " + categoryName);
        }
    }

    public void removeCategory(String categoryName) {
        if (categories.containsKey(categoryName)) {
            categories.remove(categoryName);
            System.out.println("Kategorie entfernt: " + categoryName);
        } else {
            System.out.println("Kategorie nicht gefunden: " + categoryName);
        }
    }

    public void viewCategories() {
        if (categories.isEmpty()) {
            System.out.println("Keine Kategorien vorhanden.");
        } else {
            System.out.println("Kategorien:");
            for (String categoryName : categories.keySet()) {
                System.out.println(categoryName);
            }
        }
    }

    public void removeTask(String categoryName, int index) {
        if (categories.containsKey(categoryName)) {
            ArrayList<Task> tasks = categories.get(categoryName);
            if (index >= 0 && index < tasks.size()) {
                String removedTask = tasks.get(index).getDescription();
                tasks.remove(index);
                System.out.println("Aufgabe entfernt (" + categoryName + "): " + removedTask);
            } else {
                System.out.println("Ungültiger Aufgabenindex für die Kategorie " + categoryName + ".");
            }
        } else {
            System.out.println("Kategorie nicht gefunden: " + categoryName);
        }
    }
}