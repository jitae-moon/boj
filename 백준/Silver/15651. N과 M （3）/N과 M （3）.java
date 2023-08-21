
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] ans;
    static BufferedWriter bw;

    static void dfs(int level) throws Exception {
        if (level == m) {
            for (int i : ans) {
                bw.write(i + " ");
            }
            bw.write("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                ans[level] = i;
                dfs(level+1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = new int[m];
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dfs(0);
        bw.flush();
    }
}
