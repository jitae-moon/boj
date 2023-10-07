import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dy = new int[n+1][10];

        for (int i = 0; i < 10; i++) {
            dy[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dy[i][j] = dy[i-1][1] % 1_000_000_000;
                } else if (j == 9) {
                    dy[i][j] = dy[i - 1][8] % 1_000_000_000;
                } else {
                    dy[i][j] = (dy[i-1][j-1] % 1_000_000_000) + (dy[i-1][j+1] % 1_000_000_000) % 1_000_000_000;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < 10; i++) {
            ans = ((ans % 1_000_000_000) + (dy[n][i] % 1_000_000_000)) % 1_000_000_000;
        }
        System.out.println(ans);
    }
}
