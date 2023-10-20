import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];

        dp[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }
        int ans = Integer.MIN_VALUE;

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(dp));
        for (int i = k; i <= n; i++) {
            if (dp[i] - dp[i - k] > ans) ans = dp[i] - dp[i - k];
        }

        System.out.println(ans);
    }
}
