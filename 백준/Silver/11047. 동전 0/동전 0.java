import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, k;
    static int ans;
    static List<Integer> coins;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        n = Integer.parseInt(strArr[0]);
        k = Integer.parseInt(strArr[1]);
        coins = new ArrayList<>();
        ans = 0;

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp <= k) {
                coins.add(tmp);
            }
        }
        Collections.sort(coins, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < coins.size(); i++) {
            while (k >= coins.get(i)) {
                k -= coins.get(i);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
