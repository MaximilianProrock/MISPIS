import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResearchAssociateTest {

    @Test
    void getFieldOfStudy() {
        ResearchAssociate researchAssociate = new ResearchAssociate("newField", 10, "Ivan", "ivan-mail@mail.com", 10);
        Assertions.assertEquals("newField", researchAssociate.getFieldOfStudy());
    }

    @Test
    void setFieldOfStudy() {
        ResearchAssociate researchAssociate = new ResearchAssociate("newField", 10, "Ivan", "ivan-mail@mail.com", 10);
        researchAssociate.setFieldOfStudy("newField - 1");
        Assertions.assertEquals("newField - 1", researchAssociate.getFieldOfStudy());
    }
}