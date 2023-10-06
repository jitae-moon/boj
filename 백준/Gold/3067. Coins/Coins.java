import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int solution(int[] coins, int cost) {
        int[] dy = new int[cost + 1];
        for (int coin : coins) {
            // 코인 한 개로 만들 수 있는 값
            dy[coin]++;
            for (int i = coin; i <= cost; i++) {
                dy[i] += dy[i - coin];
            }
        }
        return dy[cost];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int coinCnt = sc.nextInt();
            int[] coins = new int[coinCnt];
            for (int j = 0; j < coinCnt; j++) {
                coins[j] = sc.nextInt();
            }
            int cost = sc.nextInt();
            int ans = solution(coins, cost);
            System.out.println(ans);
        }

    }
}
