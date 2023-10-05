import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        int[] alpha = new int[26];
        for (char ch : s.toCharArray()) {
            alpha[ch - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        String ans = "";
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                cnt++;
                ans = (char) (i + 'a') + "";
            } else if (alpha[i] == max) {
                ans = "?";
            }
        }

        System.out.println(ans.toUpperCase());
    }
}
