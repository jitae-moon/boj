

import java.util.*;

public class Main {
    static int check(int[] arr, int n) {
        int lt = 0;
        int rt = arr.length - 1;
        int mid = 0;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if (arr[mid] > n) {
                rt = mid - 1;
            } else if (arr[mid] < n) {
                lt = mid + 1;
            } else return 1;
        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        Arrays.sort(arr);

        for (int num: arr2) System.out.print(check(arr, num) + " ");
    }
}
