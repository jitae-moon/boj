
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphaCnt = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String a = sc.nextLine();
        String b = sc.nextLine();

        String str = "";

        for (int i = 0; i < a.length(); i++) {
            str += a.charAt(i);
            str += b.charAt(i);
        }

        int[] ans = new int[str.length()];
        for (int i = 0; i < ans.length; i++) ans[i] = alphaCnt[str.charAt(i) - 'A'];

        for (int i = 0; i < ans.length - 2; i++) {
            for (int j = 0; j < ans.length - 1; j++) {
                ans[j] = (ans[j] + ans[j + 1]) % 10;
            }
        }

        System.out.println("" + ans[0] + ans[1]);
    }
}
