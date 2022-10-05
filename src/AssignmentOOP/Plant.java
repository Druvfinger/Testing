package AssignmentOOP;

abstract class Plant implements Printable { //implements interface on all it's subclasses
    private final String name; //Inkapsling
    private final double height;

    Plant(String name, double height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    abstract double calculateWaterNeed();

    @Override
    public void printMe() {

    }
}
