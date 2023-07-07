
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (set.contains(sc.next())) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
