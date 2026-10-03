import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int largest = num;
        for (int i = 1; i < n; i++) {
            num = sc.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}