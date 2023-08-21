
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] ans;
    static int[] vis;

    static void dfs(int level) {
        if (level == m) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (vis[i] == 0) {
                    vis[i] = 1;
                    ans[level] = i;
                    dfs(level + 1);
                    vis[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ans = new int[m];
        vis = new int[n+1];
        dfs(0);
    }
}
