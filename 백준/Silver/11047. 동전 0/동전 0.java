import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        int ans = 0;
        while (true) {
            for (int coin : coins) {
                if (k >= coin) {
                    int cnt = k / coin;
                    ans += cnt;
                    k = k - cnt * coin;
                }
            }
            if (k == 0) break;
        }

        System.out.println(ans);
    }

}