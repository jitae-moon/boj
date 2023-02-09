import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str = sc.nextLine() + " ";
		boolean tag = false;
		
		for (char ch: str.toCharArray()) {
			if (ch == '<') {
				tag = true;
				printStack(stack);
				System.out.print(ch);
			} else if (ch == '>') {
				tag = false;
				System.out.print(ch);
			} else if (tag) {
				System.out.print(ch);
			} else {
				if (ch == ' ') {
					printStack(stack);
					System.out.print(ch);
				} else {
					stack.push(ch);
				}
			}
		}
		
	}
	
	static void printStack(Stack<Character> stack) {
		while (!stack.empty()) {
			System.out.print(stack.pop());
		}
	}
}
