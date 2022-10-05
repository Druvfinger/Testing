package AssignmentOOP;

import org.junit.jupiter.api.Test;

class CactusTest {
    Cactus testCacti = new Cactus("Pelle", 10);
    @Test
    void calculateWaterNeed() {
        assert (testCacti.calculateWaterNeed() == 0.02);
    }
}