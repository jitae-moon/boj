

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 0) {
            for (int i = 0; i < 26; i++) System.out.print(-1 + " ");
            return;
        }
        int[] cnt = new int[26];
        for (char ch: str.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print(str.indexOf((char) (i+97)) + " ");
        }
    }
}



// baekjoon
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1