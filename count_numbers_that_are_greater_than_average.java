import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
                                         
        // find sum for the average 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / n;
        int count = 0;
        // Count numbers that are greater than the average 
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}