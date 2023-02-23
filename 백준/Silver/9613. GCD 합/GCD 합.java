import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase;
		testCase = sc.nextInt();
		
		while (testCase-- > 0) {
			int num = sc.nextInt();
			int[] numbers = new int[num];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}
			long sum = 0;
			for (int i = 0; i < numbers.length - 1; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					sum += getGCD(numbers[i], numbers[j]); 
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
	}
	
	static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		
		return getGCD(b, a % b);
	}
}
