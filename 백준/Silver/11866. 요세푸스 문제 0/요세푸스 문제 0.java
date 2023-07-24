
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            list.add(queue.poll());
        }

        String ans = "";
        ans += "<";
        for (int i = 0; i < n - 1; i++) {
            ans += list.get(i) + ", ";
        }
        ans += list.get(n-1) + ">";
        System.out.println(ans);
        
    }
}
