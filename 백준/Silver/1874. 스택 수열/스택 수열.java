import java.util.*;

public class Main {
	static void stackNum(int[] arr) {
		int len = arr.length;
		int currentNum = 1;
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int n: arr) {
			if (n >= currentNum) {
				while (n >= currentNum) {
					stack.push(currentNum);
					currentNum++;
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				if (n == stack.peek()) {
					stack.pop();
					sb.append("-\n");
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numArr = new int[n];
		
		for (int i = 0; i < n; i++) {
			numArr[i] = sc.nextInt();
		}
		
		stackNum(numArr);
	}
}
