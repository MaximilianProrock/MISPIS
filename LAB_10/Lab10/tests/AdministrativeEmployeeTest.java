import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativeEmployeeTest {

    @Test
    void getSsNo() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        assertEquals(10, employee.getSsNo());
    }

    @Test
    void setSsNo() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        employee.setSsNo(15);
        assertEquals(15, employee.getSsNo());
    }

    @Test
    void getName() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        assertEquals("Ivan", employee.getName());
    }

    @Test
    void setName() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        employee.setName("Mike");
        assertEquals("Mike", employee.getName());
    }

    @Test
    void getEmail() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        assertEquals("ivan-mail@mail.com", employee.getEmail());
    }

    @Test
    void setEmail() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        employee.setEmail("new-mail@mail.com");
        assertEquals("new-mail@mail.com", employee.getEmail());
    }

    @Test
    void getCounter() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        assertEquals(10, employee.getCounter());
    }

    @Test
    void setCounter() {
        Employee employee = new AdministrativeEmployee(10, "Ivan", "ivan-mail@mail.com", 10);
        employee.setCounter(15);
        assertEquals(15, employee.getCounter());
    }

}