import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		t = Integer.valueOf(br.readLine());

		while (t-- > 0) {
			String str = br.readLine() + " ";
			Stack<Character> stack = new Stack<>();
			for (char ch: str.toCharArray()) {
				if (ch != ' '  && ch != '\n') {
					stack.push(ch);
				} else {
					if (stack.empty()) {
						break;
					} else {
						while (!stack.empty()) {
							bw.write(stack.pop());
						}
						bw.write(" ");
					}
				}
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
