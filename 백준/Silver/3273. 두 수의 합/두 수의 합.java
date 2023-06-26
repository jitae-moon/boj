
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        int sum = 0;
        int ans = 0;
        while (lt < rt) {
            sum = arr[lt] + arr[rt];
            if (sum > x) rt--;
            else if (sum < x) lt++;
            else {
                ans++;
                lt++;
            }
        }
        System.out.println(ans);

    }
}
