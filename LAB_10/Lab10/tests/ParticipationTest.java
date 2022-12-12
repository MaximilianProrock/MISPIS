import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipationTest {

    @Test
    void getHours() {
        Participation participation = new Participation(20);
        Assertions.assertEquals(20, participation.getHours());
    }

    @Test
    void setHours() {
        Participation participation = new Participation(20);
        participation.setHours(30);
        Assertions.assertEquals(30, participation.getHours());
    }
}