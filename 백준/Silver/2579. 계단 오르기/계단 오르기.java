
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stairs = new int[n + 1];

        for (int i = 1; i < n + 1; i++) stairs[i] = sc.nextInt();

        int[] dy = new int[n + 1];

        dy[1] = stairs[1];
        if (n >= 2) dy[2] = dy[1] + stairs[2];
        for (int i = 3; i <= n; i++) {
            dy[i] = Math.max(dy[i-2], dy[i-3] + stairs[i-1]) + stairs[i];
        }

        System.out.println(dy[n]);
    }
}
