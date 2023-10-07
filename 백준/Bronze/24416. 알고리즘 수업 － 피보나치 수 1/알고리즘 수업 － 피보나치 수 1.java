import java.util.Scanner;

public class Main {
    static int cnt1, cnt2;

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static int dp(int n) {
        int[] dy = new int[n + 1];
        dy[1] = dy[2] = 1;
        for (int i = 3; i <= n; i++) {
            cnt2++;
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        dp(n);

        System.out.println(cnt1 + " " + cnt2);
    }
}
