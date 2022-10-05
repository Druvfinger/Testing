package AssignmentOOP;

public enum WaterType {
    MINERALWATER ("Mineral Water"),
    TAPWATER ("Tap Water"),
    PROTEINDRINK ("Protein Drink");

    public final String waterType;

    WaterType(String s) {
        waterType = s;
    }
}
