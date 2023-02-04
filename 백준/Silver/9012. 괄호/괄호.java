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
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			String str = br.readLine();
			String result = isValid(str);
			bw.write(result + "\n");
		}
		bw.flush();
	}
	
	public static String isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch: str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else {
				if (!stack.empty()) {
					stack.pop();
				} else {
					return "NO";
				}
			}
		}
		if (!stack.empty()) {
			return "NO";
		}
		return "YES";
	}
}
