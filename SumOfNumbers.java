package basic_things;
 import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner SON= new Scanner(System.in);
        System.out.println("Enter sum 1:");
        int sum1= SON.nextInt();
        System.out.println("Enter sum 2:");
        int sum2= SON.nextInt();
        System.out.println("Enter sum 3:");
        int sum3= SON.nextInt();
        System.out.println("Enter sum 4:");
        int sum4= SON.nextInt();
        System.out.println(sum1+sum2+sum3+sum4);
    }
}
