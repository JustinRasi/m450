import ch.m450.model.Category;
import ch.m450.model.Task;
import ch.m450.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TaskTest {
    private Task task;
    private Category category;
    private User user;

    @BeforeEach
    void setUp() {
        category = mock(Category.class);
        user = mock(User.class);
        task = new Task("Task description", false, LocalDateTime.now());
    }

    @Test
    void setCategory() {
        when(category.getName()).thenReturn("Shopping");
        task.setCategory(category);
        assertEquals("Shopping", task.getCategory().getName());
    }

    @Test
    void setUser() {
        when(user.getUsername()).thenReturn("John");
        when(user.getAge()).thenReturn(30);
        task.setUser(user);
        assertEquals("John", task.getUser().getUsername());
        assertEquals(30, task.getUser().getAge());
    }

    @Test
    void isOverdue() {
        task.setDueTo(LocalDateTime.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    void isNotOverdue() {
        task.setDueTo(LocalDateTime.now().plusDays(1));
        assertFalse(task.isOverdue());
    }

    @Test
    void isCompleted() {
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }

    @Test
    void isNotCompleted() {
        task.setCompleted(false);
        assertFalse(task.isCompleted());
    }

    @Test
    void setIsCompleted() {
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }

    @Test
    void getDescription() {
        assertEquals("Task description", task.getDescription());
    }

    @Test
    void getCreatedAt() {
        assertNotNull(task.getCreatedAt());
    }

    @Test
    void getDueTo() {
        LocalDateTime dueTo = LocalDateTime.now().plusDays(1);
        task.setDueTo(dueTo);
        assertEquals(dueTo, task.getDueTo());
    }

    @Test
    void setDueTo() {
        LocalDateTime dueTo = LocalDateTime.now().plusDays(2);
        task.setDueTo(dueTo);
        assertEquals(dueTo, task.getDueTo());
    }
}