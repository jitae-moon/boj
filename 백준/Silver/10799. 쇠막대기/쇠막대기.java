import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chArr = sc.nextLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		int cnt = 0;

		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == '(') {
				stack.push(chArr[i]);
			} else {
				if (chArr[i-1] == '(') {
					stack.pop();
					cnt += stack.size();
				} else {
					stack.pop();
					cnt += 1;
				}
			}
		}
		System.out.println(cnt);
	}
}
