
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static boolean check(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (!map.containsKey(chArr[i])) {
                map.put(chArr[i], 1);
            } else {
                if (chArr[i] == chArr[i-1]) continue;
                else return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (check(str)) ans++;
        }

        System.out.println(ans);
    }
}
