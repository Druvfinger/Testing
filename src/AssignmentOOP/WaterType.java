package AssignmentOOP;

public enum WaterType {
    MINERALWATER ("Mineral Water"),
    TAPWATER ("Tap Water"),
    PROTEINDRINK ("Protein Drink");

    public final String makePretty;

    WaterType(String s) {
        makePretty = s;
    }
}
