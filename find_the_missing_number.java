import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Calculate sum of given numbers
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }
        // Expected sum from 1 to N
        int expectedSum = n * (n + 1) / 2;
       
        int missing = expectedSum - sum;
        System.out.println(missing);
    }
}