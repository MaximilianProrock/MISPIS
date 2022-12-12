import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    @Test
    void getDean() {
        Faculty faculty = new Faculty(new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10), "CFS");
        Employee dean = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        Assertions.assertEquals(dean, faculty.getDean());
    }

    @Test
    void setDean() {
        Faculty faculty = new Faculty(new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10), "CFS");
        faculty.setDean(new AdministrativeEmployee(15, "Mike", "ivan-mail@mail.com", 15));
        Employee dean = new AdministrativeEmployee(15, "Mike", "ivan-mail@mail.com", 15);
        Assertions.assertEquals(dean, faculty.getDean());
    }

    @Test
    void getName() {
        Faculty faculty = new Faculty(new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10), "CFS");
        Assertions.assertEquals("CFS", faculty.getName());
    }

    @Test
    void setName() {
        Faculty faculty = new Faculty(new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10), "CFS");
        faculty.setName("PMM");
        Assertions.assertEquals("PMM", faculty.getName());
    }
}