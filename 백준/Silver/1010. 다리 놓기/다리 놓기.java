
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int[][] dy;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = sc.nextInt();

        dy = new int[30][30];

        for (int i = 0; i < testCase; i++) {
            int r = sc.nextInt();
            int n = sc.nextInt();
            int ans = getCombination(n, r);
            bw.write(ans + "\n");
        }
        bw.flush();
    }

    // nCr = n-1Cr-1 + n-1Cr을 이용
    static int getCombination(int n, int r) {
        // dy에 이미 저장되어있을 경우 return(memoization)
        if (dy[n][r] > 0) return dy[n][r];
        // nC0 || nCn = 1
        if (r == 0 || n == r) return 1;
        else return dy[n][r] = getCombination(n - 1, r - 1) + getCombination(n - 1, r);
    }
}
