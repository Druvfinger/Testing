package AssignmentOOP;

public class Palmtree extends Plant {

    Palmtree(String name, double height) {
        super(name, height);
        waterType = WaterType.TAPWATER;
    }


    @Override
    double calculateWaterNeed() {
        return 0.5 * getHeight();
    }

}
