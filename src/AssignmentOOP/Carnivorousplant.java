package AssignmentOOP;

public class Carnivorousplant extends Plant {


    Carnivorousplant(String name, double height, String waterType) {
        super(name, height, waterType);
    }

    @Override
    double calculateWaterNeed() {
        return 0.1 +(0.2*getHeight());
    }


    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " +  getWaterType() + " per day");
    }
}
