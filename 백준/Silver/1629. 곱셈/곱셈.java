
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long a, b, c;

    static long dfs(long a, long b) {
        if (b == 1) {
            return a % c;
        } else {
            long tmp = dfs(a, b / 2);

            if (b % 2 == 1) {
                return (tmp * tmp) % c * a % c;
            } else {
                return tmp * tmp % c;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        long ans = dfs(a, b);
        System.out.println(ans);

    }
}
