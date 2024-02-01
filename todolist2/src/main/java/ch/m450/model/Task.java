package ch.m450.model;

import java.time.LocalDateTime;

public class Task {
    private String description;
    private boolean isCompleted;
    private Category category;
    private User user;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime dueTo;

    public Task(){}

    public Task(String description, boolean isCompleted, LocalDateTime dueTo) {
        this.description = description;
        this.isCompleted = isCompleted;
        this.dueTo = dueTo;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getDueTo() {
        return dueTo;
    }

    public void setDueTo(LocalDateTime dueTo) {
        this.dueTo = dueTo;
    }

    public boolean isOverdue() {
        return dueTo.isBefore(LocalDateTime.now());
    }
}