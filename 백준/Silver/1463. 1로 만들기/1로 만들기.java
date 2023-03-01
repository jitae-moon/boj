import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		System.out.println(dp(n));
	}
	
	public static int dp(int number) {
		int[] cache = new int[number + 1];
		
		for (int i = 2; i <= number; i++) {
			cache[i] = cache[i-1] + 1;
			if (i % 2 == 0) {
				cache[i] = Math.min(cache[i], cache[i/2] + 1);
			}
			
			if (i % 3 == 0) {
				cache[i] = Math.min(cache[i], cache[i/3] + 1);
			}
		}
		
		return cache[number];
	}
}
