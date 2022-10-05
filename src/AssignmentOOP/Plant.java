package AssignmentOOP;

abstract class Plant implements Printable { //implements interface on all it's subclasses
    private final String name; //Inkapsling
    private final double height;

    String waterType;

    Plant(String name, double height, String waterType){
        this.name = name;
        this.height = height;
        this.waterType = waterType;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getWaterType() {
        return waterType;
    }

    abstract double calculateWaterNeed();

    @Override
    public void printMe() {

    }
}
