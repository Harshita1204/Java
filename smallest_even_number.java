import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallestEven = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                if (num < smallestEven) {
                    smallestEven = num;
                }
            }
        }
        System.out.println(smallestEven);
    }
}