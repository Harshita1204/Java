package basic_things;
import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle value:");
        double p = sc.nextDouble();
        System.out.println("Enter rate value:");
        double r = sc.nextDouble();
        System.out.println("Enter time:");
        double t = sc.nextDouble();
       // System.out.println("Simple Interest: "+p*r*t/100); // either we can use this
        double si = p*r*t/100; // or we can use this way
        System.out.println(si);
    }
}
