import java.util.*;

public class Main {
    static int[] arr;
    static int check(int n) {
        int lt = 0, rt = arr.length-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == n) {
               return 1;
            }
            else if (arr[mid] < n) lt = mid + 1;
            else rt = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int m = sc.nextInt();
        int[] target = new int[m];
        for (int i = 0; i < m; i++) target[i] = sc.nextInt();

        for (int i: target) {
            System.out.println(check(i));
        }
    }
}