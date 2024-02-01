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
        task = new Task("Buy milk", false, LocalDateTime.of(2024, 2, 1, 11, 0));
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
}