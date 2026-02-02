package CAP555;

import java.util.Scanner;

public class Deviation {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the 3 digit number: ");
       int a = sc.nextInt();
       int sum = 0;
       int temp = a;

       while (temp > 0) {
           sum = sum + (temp % 10);
           temp = temp / 10;
       }
    System.out.println("The sum of the 3 digit number is: "+sum);

       double avg = sum / 3.0;
       System.out.println("Average of the sum of the 3 digit number: "+avg);

       temp = a;

       while (temp > 0) {
           int digit = temp % 10;
           System.out.println(digit + " - " + avg + " = " + Math.abs(digit - avg));
           temp = temp / 10;
       }
    }
}
