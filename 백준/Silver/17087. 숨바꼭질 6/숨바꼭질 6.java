import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, s, ans;
		n = sc.nextInt();
		s = sc.nextInt();
		int[] points = new int[n];
		int[] diff = new int[n];
		
		for (int i = 0; i < n; i++) {
			points[i] = sc.nextInt();
			diff[i] = Math.abs(s - points[i]);
		}
		
		ans = diff[0];
		
		for (int i = 1; i < n; i++) {
			ans = getGCD(ans, diff[i]);
		}
		System.out.println(ans);
		sc.close();
	}
	
	public static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		
		return getGCD(b, a % b);
	}
}
