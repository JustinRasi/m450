import org.example.Task;
import org.example.TodoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoListTest {

    private TodoList todoList;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Mock
    private Task mockTask;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        todoList = new TodoList();
        System.setOut(new PrintStream(outContent));

        // Konfigurieren des Mock-Objekts
        when(mockTask.getDescription()).thenReturn("Mocked Task Description");
    }

    @Test
    public void testAddTaskWithMockedTask() {
        todoList.addCategory("Work");
        todoList.addTask("Work", mockTask.getDescription());
        assertTrue(outContent.toString().contains("Aufgabe hinzugefügt (Work): Mocked Task Description"));
    }

    @Test
    public void testAddCategory() {
        todoList.addCategory("Work");
        assertTrue(outContent.toString().contains("Kategorie hinzugefügt: Work"));
    }

    @Test
    public void testAddTask() {
        todoList.addCategory("Work");
        todoList.addTask("Work", "Complete report");
        assertTrue(outContent.toString().contains("Aufgabe hinzugefügt (Work): Complete report"));
    }

    @Test
    public void testAddTaskToNonExistentCategory() {
        todoList.addTask("Home", "Do laundry");
        assertTrue(outContent.toString().contains("Kategorie nicht gefunden: Home"));
    }

    @Test
    public void testViewTasks() {
        todoList.addCategory("Work");
        todoList.addTask("Work", "Complete report");
        todoList.viewTasks("Work");
        assertTrue(outContent.toString().contains("Aufgaben in der Kategorie Work:\n1. Complete report"));
    }

    @Test
    public void testViewTasksInEmptyCategory() {
        todoList.addCategory("Work");
        todoList.viewTasks("Work");
        assertTrue(outContent.toString().contains("Keine Aufgaben in der Kategorie Work."));
    }

    @Test
    public void testViewNonExistentCategoryTasks() {
        todoList.viewTasks("Home");
        assertTrue(outContent.toString().contains("Kategorie nicht gefunden: Home"));
    }

    @Test
    public void testRemoveCategory() {
        todoList.addCategory("Work");
        todoList.removeCategory("Work");
        assertTrue(outContent.toString().contains("Kategorie entfernt: Work"));
    }

    @Test
    public void testRemoveNonExistentCategory() {
        todoList.removeCategory("Home");
        assertTrue(outContent.toString().contains("Kategorie nicht gefunden: Home"));
    }

    @Test
    public void testViewCategories() {
        todoList.addCategory("Work");
        todoList.addCategory("Home");
        todoList.viewCategories();
        assertTrue(outContent.toString().contains("Kategorien:\nWork\nHome"));
    }

    @Test
    public void testViewCategoriesWhenNoneExist() {
        todoList.viewCategories();
        assertTrue(outContent.toString().contains("Keine Kategorien vorhanden."));
    }

    @Test
    public void testRemoveTask() {
        todoList.addCategory("Work");
        todoList.addTask("Work", "Complete report");
        todoList.removeTask("Work", 0);
        assertTrue(outContent.toString().contains("Aufgabe entfernt (Work): Complete report"));
    }

    @Test
    public void testRemoveTaskWithInvalidIndex() {
        todoList.addCategory("Work");
        todoList.addTask("Work", "Complete report");
        todoList.removeTask("Work", 1);
        assertTrue(outContent.toString().contains("Ungültiger Aufgabenindex für die Kategorie Work."));
    }

    @Test
    public void testRemoveTaskFromNonExistentCategory() {
        todoList.removeTask("Home", 0);
        assertTrue(outContent.toString().contains("Kategorie nicht gefunden: Home"));
    }
}
