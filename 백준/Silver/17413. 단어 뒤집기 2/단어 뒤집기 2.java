import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = sc.nextLine() + " ";
		boolean tag = false;
		
		for (char ch: str.toCharArray()) {
			if (ch == '<') {
				tag = true;
				printStack(stack, bw);
				bw.write(ch);
			} else if (ch == '>') {
				tag = false;
				bw.write(ch);
			} else if (tag) {
				bw.write(ch);
			} else {
				if (ch == ' ') {
					printStack(stack, bw);
					bw.write(ch);
				} else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
	}
	
	static void printStack(Stack<Character> stack, BufferedWriter bw) throws IOException {
		while (!stack.empty()) {
			bw.write(stack.pop());
		}
	}
}
