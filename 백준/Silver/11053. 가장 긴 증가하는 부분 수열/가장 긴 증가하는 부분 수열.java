
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] dy = new int[n];

        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int tmp = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    tmp = Math.max(tmp, dy[j]);
                }
            }
            dy[i] = tmp + 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) ans = Math.max(ans, dy[i]);
        System.out.println(ans);
    }
}
