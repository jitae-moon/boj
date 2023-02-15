import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		
		return getGCD(b, a % b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		int a, b, lcm;
		
		while (testCase-- > 0) {
			String[] strArr = br.readLine().split(" ");
			a = Integer.valueOf(strArr[0]);
			b = Integer.valueOf(strArr[1]);
			lcm = a * b / getGCD(a, b);
			bw.write(lcm + "\n");
		}
		bw.flush();
	}
	
}