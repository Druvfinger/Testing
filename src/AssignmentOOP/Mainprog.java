package AssignmentOOP;

import javax.swing.*;

public class Mainprog {

    public void printWaterNeeds(Printable info){
        info.printMe();
    }
    public Mainprog(){
        Plant Igge = new Cactus("Igge" , 0.2);
        Plant Laura = new Palmtree("Laura", 5);
        Plant Meatloaf = new Carnivorousplant("Meatloaf",0.7);
        Plant Putte = new Palmtree("Putte", 1);
        String answer = JOptionPane.showInputDialog("Which plant is to be watered?");
        answer = answer.toLowerCase();
        switch (answer) {
            case "igge" -> printWaterNeeds(Igge);
            case "laura" -> printWaterNeeds(Laura);
            case "meatloaf" -> printWaterNeeds(Meatloaf);
            case "putte" -> printWaterNeeds(Putte);
            default -> System.out.println("There is no such Plant in the hotel or you misspelled the name");
        }
    }
    public static void main(String[] args) {
        Mainprog test = new Mainprog();
    }
}
