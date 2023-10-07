
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dy = new int[n + 1];
        dy[1] = 1;
        if (n >= 2) {
            dy[2] = 2;
        }
        for (int i = 3; i <= n; i++) {
            dy[i] = (dy[i - 1] % 15746 + dy[i - 2] % 15746) % 15746;
        }
        System.out.println(dy[n]);
    }
}
