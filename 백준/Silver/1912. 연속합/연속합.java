

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] dy = new int[n];

        dy[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dy[i] = Math.max(arr[i], dy[i - 1] + arr[i]);
        }

        int ans = Integer.MIN_VALUE;
        for (int tmp : dy) {
            ans = Math.max(tmp, ans);
        }

        System.out.println(ans);
    }
}
