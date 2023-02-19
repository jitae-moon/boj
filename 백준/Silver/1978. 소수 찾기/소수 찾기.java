import java.util.Scanner;

public class Main {
	static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int i: numbers) {
			if (isPrime(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}