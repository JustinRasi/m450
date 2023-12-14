package ch.tbz.m450.testing.tools;

import ch.tbz.m450.testing.tools.controller.StudentController;
import ch.tbz.m450.testing.tools.repository.StudentRepository;
import ch.tbz.m450.testing.tools.repository.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
@AutoConfigureMockMvc
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void shouldReturnListOfStudents() throws Exception {
        List<Student> students = Arrays.asList(
                new Student(1, "Justin", "justin@tbz.ch"),
                new Student(2, "Marco", "marco@tbz.ch")
        );

        given(studentRepository.findAll()).willReturn(students);

        mockMvc.perform(get("/students")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].name").value("Justin"))
                .andExpect(jsonPath("$[1].name").value("Marco"));
    }

    @Test
    public void shouldAddStudent() throws Exception {
        Student newStudent = new Student("NewStudent", "newstudent@tbz.ch");

        mockMvc.perform(post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"NewStudent\",\"email\":\"newstudent@tbz.ch\"}"))
                .andExpect(status().isOk());
    }
}
