package AssignmentOOP;

public class Cactus extends Plant { //arv


    Cactus(String name, double height, String waterType) {
        super(name, height,waterType);
    }

    @Override
    double calculateWaterNeed() {
        return 0.02;
    }



    @Override
    public void printMe() {
        System.out.println(getName() + " needs "+ calculateWaterNeed() + "L " +  getWaterType() + " per day");
    }
}
