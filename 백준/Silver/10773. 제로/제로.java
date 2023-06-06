

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        int n = 0;
        for (int i = 0; i < k; i++) {
            n = sc.nextInt();
            if (n != 0) stack.push(n);
            else stack.pop();
        }
        int sum = 0;
        for (int i: stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
