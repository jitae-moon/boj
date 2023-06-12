

import java.util.*;

public class Main {
    static int check(String str, String target) {
        int cnt = 0;
        int pos = 0;
        while (true) {
            if (str.indexOf(target, pos) == -1) break;
            cnt++;
            pos = (str.indexOf(target,pos) + target.length());
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String target = sc.nextLine();

        int res = check(str, target);
        System.out.println(res);
    }
}
