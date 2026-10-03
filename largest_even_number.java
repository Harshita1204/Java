import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largestEven = Integer.MIN_VALUE;  // Integer.MIN_VALUE means the smallest possible int number, so any input number will be bigger than it initially.
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                if (num > largestEven) {
                    largestEven = num;
                }
            }
        }
        System.out.println(largestEven);
    }
}