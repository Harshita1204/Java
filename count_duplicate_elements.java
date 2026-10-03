import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < n; i++) {  // store numbers and then compare them 
            arr[i] = sc.nextInt();
        }
        int duplicateCount = 0;
        // Check every element with the elements after it first i =0 , j=1 and then will be comparing till i==j
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                duplicateCount++;
            }
        }
        System.out.println(duplicateCount);
    }
}