import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstituteTest {

    @Test
    void getName() {
        Institute institute = new Institute("ВГУ", "Университетская площадь, 1");
        Assertions.assertEquals("ВГУ", institute.getName());
    }

    @Test
    void setName() {
        Institute institute = new Institute("ВГУ", "Университетская площадь, 1");
        institute.setName("VSU");
        Assertions.assertEquals("VSU", institute.getName());
    }

    @Test
    void getAddress() {
        Institute institute = new Institute("ВГУ", "Университетская площадь, 1");
        Assertions.assertEquals("Университетская площадь, 1", institute.getAddress());
    }

    @Test
    void setAddress() {
        Institute institute = new Institute("ВГУ", "Университетская площадь, 1");
        institute.setAddress("Университетская площадь, 10");
        Assertions.assertEquals("Университетская площадь, 10", institute.getAddress());
    }
}