package com.example.usecase7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentConverterTest {

    private StudentConverter converter = new StudentConverter();

    @Test
    void highAchieverTest() {
        List<Student> input = new ArrayList<>();

        input.add(new Student("student1", 21, 97));

        List<Student> result = converter.convertStudents(input);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.stream().filter(Student::isHonorRoll).collect(Collectors.toList()).size()).isEqualTo(input.size());
    }

    @Test
    void exceptionalYoungHighAchieverTest() {
        List<Student> input = new ArrayList<>();

        Student student = new Student("student1", 20, 97);

        input.add(student);

        List<Student> result = converter.convertStudents(input);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.stream().filter(Student::isExceptional).collect(Collectors.toList()).size()).isEqualTo(input.size());
    }

    @Test
    void passedStudentTest() {
        List<Student> input = new ArrayList<>();

        input.add(new Student("student1", 25, 78));

        List<Student> result = converter.convertStudents(input);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.stream().filter(Student::isPassed).collect(Collectors.toList()).size()).isEqualTo(input.size());
    }

    @Test
    void failedStudentTest() {
        List<Student> input = new ArrayList<>();

        input.add(new Student("student1", 25, 68));

        List<Student> result = converter.convertStudents(input);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.stream().filter(x -> !x.isPassed()).collect(Collectors.toList()).size()).isEqualTo(input.size());
    }

    @Test
    void emptyArrayTest() {
        List<Student> input = new ArrayList<>();

        List<Student> result = converter.convertStudents(input);

        assertTrue(result.isEmpty());
    }

    @Test
    void nullInputTest() {
        assertThrows(Exception.class, () -> converter.convertStudents(null));
    }
}
