package AssignmentOOP;

public class Carnivorousplant extends Plant {

    Carnivorousplant(String name, double height) {
        super(name, height);
        waterType = WaterType.PROTEINDRINK;
    }

    @Override
    double calculateWaterNeed() {
        return 0.1 +(0.2*getHeight());
    }
}
