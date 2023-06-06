

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int res = a * b * c;
        int[] numbers = new int[10];
        for (char ch: String.valueOf(res).toCharArray()) numbers[ch - '0']++;

        for (int i: numbers) System.out.println(i);
    }
}
