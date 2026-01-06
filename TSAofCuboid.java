package basic_things;

public class TSAofCuboid {
    static void main(String[] args) {
        double l=12; //length
        double b=13; //breadth
        double h=14; //height
        double TSA=(2*l*b+2*l*h+2*h*b);
        System.out.println("Total surface area of cuboid is: "+TSA);  // Java does NOT allow comma in println → use + to join text and variable


    }
}
