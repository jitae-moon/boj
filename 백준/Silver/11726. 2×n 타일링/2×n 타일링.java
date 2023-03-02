import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		System.out.println(dp(n));
	}
	
	public static int dp(int n) {
		
		if (n == 1) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		
		int[] d = new int[n+1];
		d[1] = 1;
		d[2] = 2;
		for (int i = 3; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		
		return d[n];
	}
}
