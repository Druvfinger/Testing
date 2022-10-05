package AssignmentOOP;

public class Carnivorousplant extends Plant {

    protected WaterType waterType = WaterType.PROTEINDRINK; // Inkapsling

    public WaterType getWaterType() {
        return waterType;
    }

    Carnivorousplant(String name, double height) {
        super(name, height);
    }

    @Override
    double calculateWaterNeed() {
        return 0.1 +(0.2*getHeight());
    }


    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " +  getWaterType().makePretty + " per day");
    }
}
