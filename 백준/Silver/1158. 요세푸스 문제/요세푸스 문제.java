import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> temp = new LinkedList<>();
		String result = "";
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				queue.offer(queue.poll());
			}
			temp.offer(queue.poll());
		}
		result += "<";
		while (temp.size() != 1) {
			result += (temp.poll() + ", ");
		}
		result += (temp.poll() + ">");
		System.out.println(result);
	}
}