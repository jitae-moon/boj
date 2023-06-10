

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        float avg = 0;

        for (int i: arr) sum += i;
        avg = sum / 5.0f;
        System.out.println((int) avg);
        System.out.println(arr[2]);
    }
}
