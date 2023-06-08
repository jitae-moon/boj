

import java.util.*;

public class Main {
    static void reverse(int[] arr, int start, int end) {
        for (int i = 0; i < (end - start + 1) / 2; i++) {
            int tmp = arr[start+i];
            arr[start+i] = arr[end-i];
            arr[end-i] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cards = new int[21];
        for (int i = 0; i < 21; i++) cards[i] = i;

        for (int i = 0; i < 10; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            reverse(cards, a, b);
        }
        for (int i = 1; i < 21; i++) System.out.print(cards[i] + " ");
    }
}
