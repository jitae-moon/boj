
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] ans;

    static void dfs(int level, int start) {
        if (level == m) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= n; i++) {
                ans[level] = i;
                dfs(level + 1, i + 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ans = new int[m];

        dfs(0, 1);

    }
}
