import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getTeaches() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        List<Lecturer> otherTeachers = new ArrayList<>();
        otherTeachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        assertEquals(otherTeachers, course.getTeaches());

    }

    @Test
    void setTeaches() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);

        List<Lecturer> newTeachers = new ArrayList<>();
        newTeachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        newTeachers.add(new Lecturer("English", 15, "Mike", "ivan-mail@mail.com", 10));

        course.setTeaches(newTeachers);

        List<Lecturer> otherTeachers = new ArrayList<>();
        otherTeachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        otherTeachers.add(new Lecturer("English", 15, "Mike", "ivan-mail@mail.com", 10));
        assertEquals(otherTeachers, course.getTeaches());
    }

    @Test
    void getName() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        assertEquals("Math", course.getName());
    }

    @Test
    void setName() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        course.setName("English");
        assertEquals("English", course.getName());
    }

    @Test
    void getId() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        assertEquals(12, course.getId());
    }

    @Test
    void setId() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        course.setId(30);
        assertEquals(30, course.getId());
    }

    @Test
    void getHours() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        assertEquals(20.3f, course.getHours());
    }

    @Test
    void setHours() {
        List<Lecturer> teachers = new ArrayList<>();
        teachers.add(new Lecturer("Math", 10, "Ivan", "ivan-mail@mail.com", 10));
        Course course = new Course(teachers, "Math", 12, 20.3f);
        course.setHours(30);
        assertEquals(30, course.getHours());
    }
}