import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        // Put all non-zero elements at the beginning, check if the element is non zero put it in the beginning of an array and pos++
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        //  after all the non zero elements just Fill remaining positions with zero
        while (pos < n) {
            arr[pos] = 0;
            pos++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}