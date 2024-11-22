package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_print_message_given_1_student_and_1_teacher_when_start_school() {

            Student bob = new Student(1, "Bob", 18);
            Teacher jerry = new Teacher(1, "Jerry", 21);

            School school = new School(List.of(bob, jerry));
            school.startSchool();

            assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student. My name is Jerry. I am 21 years old. I am a teacher.");

    }

    @Test
    public void should_print_message_given_2_student_and_0_teacher_when_start_school() {

        Student bob = new Student(1, "Bob", 18);
        Student jerry = new Student(1, "Jerry", 21);

        School school = new School(List.of(bob, jerry));
        school.startSchool();

        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student. My name is Jerry. I am 21 years old. I am a student.");

    }

    @Test
    public void should_print_message_given_2_teacher_and_0_student_when_start_school() {

        Teacher bob = new Teacher(1, "Bob", 18);
        Teacher jerry = new Teacher(1, "Jerry", 21);

        School school = new School(List.of(bob, jerry));
        school.startSchool();

        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a teacher. My name is Jerry. I am 21 years old. I am a teacher.");

    }

    @Test
    public void should_print_message_given_0_teacher_and_0_student_when_start_school() {

        School school = new School(List.of());
        school.startSchool();

        assertThat(systemOut()).contains("");

    }
}
