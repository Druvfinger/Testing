package AssignmentOOP;

public class Cactus extends Plant { //arv
        Cactus(String name, double height) {
        super(name, height);
        waterType = WaterType.MINERALWATER;
    }

    @Override
    double calculateWaterNeed() {
        return 0.02;
    }
}
