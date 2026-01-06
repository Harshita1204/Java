package basic_things;

import java.util.Scanner;

public class squareOfaNumber {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double square = a*a;
        System.out.println(square);

    }
}
