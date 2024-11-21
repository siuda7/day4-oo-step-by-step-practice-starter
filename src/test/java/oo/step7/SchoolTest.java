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
    public void should_print_message_when_school_start() {

            Klass klass = new Klass(2);
            Student bob = new Student(1, "Bob", 18);
            bob.join(klass);
            klass.attach(bob);
            Teacher jerry = new Teacher(1, "Jerry", 21);
            jerry.assignTo(klass);
            klass.attach(jerry);

            School school = new School(List.of(klass));
            school.startSchool();

            assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student. I am in class 2.My name is Jerry. I am 21 years old. I am a teacher. I teach Class 2.");

    }
}
