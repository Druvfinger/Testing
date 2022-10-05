package AssignmentOOP;

import org.junit.jupiter.api.Test;

class CarnivorousplantTest {

    Carnivorousplant testCarnivorousPlant = new Carnivorousplant("BigBitey", 10);

    @Test
    void calculateWaterNeed() {
        assert (testCarnivorousPlant.calculateWaterNeed() ==  2.1);
        assert (testCarnivorousPlant.calculateWaterNeed() != 0);
    }
}