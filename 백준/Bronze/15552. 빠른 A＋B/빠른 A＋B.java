import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.valueOf(br.readLine());
		int a, b;
		
		while (t-- > 0) {
			String[] numbers = br.readLine().split(" ");
			a = Integer.valueOf(numbers[0]);
			b = Integer.valueOf(numbers[1]);
			bw.write(a + b + "\n");
		}
		
		bw.flush();
	}
}
