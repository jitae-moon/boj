
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] ans;
    static BufferedWriter bw;

    static void dfs(int level, int start) throws Exception {
        if (level == m) {
            for (int i : ans) {
                bw.write(i + " ");
            }
            bw.write("\n");

        } else {
            for (int i = start; i <= n; i++) {
                ans[level] = i;
                dfs(level + 1, i);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new int[m];

        dfs(0, 1);
        bw.flush();

    }
}
