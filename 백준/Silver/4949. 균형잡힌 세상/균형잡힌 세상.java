
import java.util.*;

public class Main {
    static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str = sc.nextLine()).equals(".")){
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == ' ' || ch == '.') continue;
                else sb.append(ch);
            }
            if (check(sb.toString())) System.out.println("yes");
            else System.out.println("no");
        }
        System.exit(0);
    }
}
