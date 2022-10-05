package AssignmentOOP;

public class Palmtree extends Plant {

    protected WaterType waterType = WaterType.TAPWATER; // Inkapsling

    public WaterType getWaterType() {
        return waterType;
    }

    Palmtree(String name, double height) {
        super(name, height);
    }

    @Override
    double calculateWaterNeed() {
        return 0.5 * getHeight();
    }

    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " + getWaterType().waterType + " per day");
    }
}
