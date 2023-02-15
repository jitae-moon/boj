import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] chArr = br.readLine().toCharArray();
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
