import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m, n;
		m = sc.nextInt();
		n = sc.nextInt();
		boolean[] check = new boolean[n + 1];
		check[0] = true;
		check[1] = true;
		
		for (int i = 2; i <= n; i++) {
			for (int j = i + i; j <= n; j+=i) {
				if (check[j] == false) {
					check[j] = true;
				}
			}
		}
		
		for (int i = m; i <= n; i++) {
			if (check[i] == false) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
	}
}
