import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        int ans = 0, cnt = 1;
        for (int score : scores) {
            if (score == 1) ans += cnt++;
            else cnt = 1;
        }
        System.out.println(ans);
    }
}
