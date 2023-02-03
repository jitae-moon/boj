import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t;
		t = Integer.valueOf(sc.nextLine());
		
		for (int i = 0; i < t; i++) {
			String[] strArr = sc.nextLine().split(" ");
			for (int j = 0; j < strArr.length; j++) {
				String str = (String) new StringBuilder(strArr[j]).reverse().toString();
				System.out.print(str + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
