
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        int[] cnt = new int[10];
        for (char ch: str.toCharArray()) {
            int n = ch - '0';
            if (n == 6 || n == 9) {
                if (cnt[6] == cnt[9]) cnt[6]++;
                else if (cnt[6] > cnt[9]) cnt[9]++;
            } else {
                cnt[n]++;
            }
        }
        for (int i: cnt) {
            if (i > ans) ans = i;
        }
        System.out.println(ans);

    }
}
