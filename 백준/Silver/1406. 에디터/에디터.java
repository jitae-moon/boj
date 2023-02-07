
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int n = Integer.valueOf(br.readLine());
		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();
		for (char c: str.toCharArray()) {
			leftStack.push(c);
		}
		while (n-- > 0) {
			String[] strArr = br.readLine().split(" ");
			char order = strArr[0].toCharArray()[0];
			if (order == 'L') {
				if (!leftStack.empty()) {
					rightStack.push(leftStack.pop());
				}
			} else if (order == 'D') {
				if (!rightStack.empty()) {
					leftStack.push(rightStack.pop());
				}
			} else if (order == 'B') {
				if (!leftStack.empty()) {
					leftStack.pop();
				}
			} else {
				leftStack.push(strArr[1].toCharArray()[0]);
			}
		}
		
		if (!rightStack.empty()) {
			while (!rightStack.empty()) {
				leftStack.push(rightStack.pop());
			}
		}
		String answer = leftStack.toString().replaceAll("[^a-z]", "");
		bw.write(answer);
		bw.flush();
	}
}
