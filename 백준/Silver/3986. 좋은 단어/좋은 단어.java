

import java.util.*;

public class Main {
    static boolean check(String str) {
        if (str.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()) {
            if (stack.isEmpty()) stack.push(ch);
            else {
                if (stack.peek() == ch) stack.pop();
                else stack.push(ch);
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (check(str)) ans++;
        }
        System.out.println(ans);
    }
}
