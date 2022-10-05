package AssignmentOOP;

public class Cactus extends Plant { //arv

    protected WaterType waterType = WaterType.MINERALWATER;  //Inkapsling

    public WaterType getWaterType() {
        return waterType;
    }

    Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    double calculateWaterNeed() {
        return 0.02;
    }



    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " + getWaterType().makePretty  + " per day");
    }
}
