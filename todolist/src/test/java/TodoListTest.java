import org.example.Category;
import org.example.TodoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class TodoListTest {

    @Mock
    private Category mockCategory;

    @InjectMocks
    private TodoList todoList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateCategory() {
        todoList.createCategory("TestCategory");
        verify(mockCategory, times(0)).addTask(any());
    }

    @Test
    void testShowCategories() {
        when(mockCategory.getName()).thenReturn("TestCategory");
        todoList.createCategory("TestCategory");
        todoList.showCategories();
        verify(mockCategory, times(0)).showTasks();
    }

    @Test
    void testDeleteCategory() {
        todoList.createCategory("TestCategory");
        todoList.deleteCategory("TestCategory");
        verify(mockCategory, times(0)).addTask(any());
    }

    @Test
    void testAddTaskToCategory() {
        when(mockCategory.getName()).thenReturn("TestCategory");
        todoList.createCategory("TestCategory");
        todoList.addTaskToCategory("TestCategory", "TestTask");
        verify(mockCategory, times(0)).addTask(any());
    }

    @Test
    void testAddTaskToNonexistentCategory() {
        todoList.addTaskToCategory("NonexistentCategory", "TestTask");
        verifyNoInteractions(mockCategory);
    }

    @Test
    void testDeleteNonexistentCategory() {
        todoList.deleteCategory("NonexistentCategory");
        verifyNoInteractions(mockCategory);
    }
}
