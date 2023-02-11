import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d%n%d%n", getGCD(a, b), a * b / getGCD(a, b));
	}
	
	static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return getGCD(b, a % b);
	}
}
