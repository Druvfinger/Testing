package AssignmentOOP;

public class Palmtree extends Plant {

    Palmtree(String name, double height, String waterType) {
        super(name, height, waterType);
    }

    @Override
    double calculateWaterNeed() {
        return 0.5 * getHeight();
    }

    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " +  getWaterType() + " per day");
    }
}
