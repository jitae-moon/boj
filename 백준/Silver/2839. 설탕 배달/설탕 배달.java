
import java.util.Scanner;

public class Main {
    static int[] arr = {5, 3};
    static int ans;
    static int n;

    static void dfs(int level, int sum) {
        if (level > ans) return;
        if (sum > n) return;
        if (ans < Integer.MAX_VALUE) return;
        if (sum == n) {
            ans = Math.min(ans, level);
        } else {
            for (int i = 0; i < 2; i++) {
                dfs(level + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ans = Integer.MAX_VALUE;
        dfs(0, 0);
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        System.out.println(ans);
    }
}
