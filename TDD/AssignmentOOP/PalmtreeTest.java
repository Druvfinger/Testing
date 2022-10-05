package AssignmentOOP;

import org.junit.jupiter.api.Test;


class PalmtreeTest {

    Palmtree testPalmtree = new Palmtree("BigPapa", 10);

    @Test
    void calculateWaterNeed() {
        assert (testPalmtree.calculateWaterNeed() == 5);
        assert (testPalmtree.calculateWaterNeed() != 10);
    }
}