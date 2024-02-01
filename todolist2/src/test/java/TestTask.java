import ch.m450.model.Category;
import ch.m450.model.Task;
import ch.m450.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        task = mock(Task.class);
    }

    @Test
    void setCategory() {
        when(category.getName()).thenReturn("Shopping");
        when(task.getCategory()).thenReturn(category);
        assertEquals("Shopping", task.getCategory().getName());
    }

    @Test
    void setUser() {
        when(user.getUsername()).thenReturn("John");
        when(user.getAge()).thenReturn(30);
        when(task.getUser()).thenReturn(user);
        assertEquals("John", task.getUser().getUsername());
        assertEquals(30, task.getUser().getAge());
    }

    @Test
    void isOverdue() {
        when(task.isOverdue()).thenReturn(true);
        assertTrue(task.isOverdue());
    }

    @Test
    void isNotOverdue() {
        when(task.isOverdue()).thenReturn(false);
        assertFalse(task.isOverdue());
    }

    @Test
    void isCompleted() {
        when(task.isCompleted()).thenReturn(true);
        assertTrue(task.isCompleted());
    }

    @Test
    void isNotCompleted() {
        when(task.isCompleted()).thenReturn(false);
        assertFalse(task.isCompleted());
    }

    @Test
    void setIsCompleted() {
        when(task.isCompleted()).thenReturn(true);
        assertTrue(task.isCompleted());
    }
}