import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) arr[i] = i;

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int tmp = arr[j + start];
                arr[j + start] = arr[end - j];
                arr[end - j] = tmp;
            }
        }

        for (int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
        
    }
}
