

import java.util.*;

public class Main {
    static boolean check(String str) {
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) return false;
            lt++;
            rt--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (check(str)) System.out.println(1);
        else System.out.println(0);
    }
}
