

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);

        while (queue.size() != 1) {
            queue.poll();
            int tmp = queue.poll();
            queue.offer(tmp);
        }
        System.out.println(queue.peek());
    }
}
