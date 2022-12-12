import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void getName() {
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        Assertions.assertEquals("APP", project.getName());
    }

    @Test
    void setName() {
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        project.setName("NEW_APP");
        Assertions.assertEquals("NEW_APP", project.getName());
    }

    @Test
    void getStart() {
        Date start = new Date(2022, Calendar.JANUARY, 20);
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        Assertions.assertEquals(start, project.getStart());
    }

    @Test
    void setStart() {
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        project.setStart(new Date(2019, Calendar.DECEMBER, 12));
        Date start = new Date(2019, Calendar.DECEMBER, 12);
        Assertions.assertEquals(start, project.getStart());
    }

    @Test
    void getEnd() {
        Date end = new Date(2023, Calendar.MAY, 23);
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        Assertions.assertEquals(end, project.getEnd());
    }

    @Test
    void setEnd() {
        Project project = new Project("APP", new Date(2022, Calendar.JANUARY, 20), new Date(2023, Calendar.MAY, 23));
        project.setEnd(new Date(2024, Calendar.DECEMBER, 12));
        Date end = new Date(2024, Calendar.DECEMBER, 12);
        Assertions.assertEquals(end, project.getEnd());
    }
}