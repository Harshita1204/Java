package basic_things;

import java.util.Scanner;

public class takingInputFromUser {
    public static void main(String[] args) {
        //Taking input from the user
        System.out.println("Enter the radius :");
        Scanner sc = new Scanner(System.in); //Scanner S -> capital , System S -> capital
        double r = sc.nextDouble(); // Double D -> capital
        double a = 3.14*r*r;
        System.out.println(a);

    }
