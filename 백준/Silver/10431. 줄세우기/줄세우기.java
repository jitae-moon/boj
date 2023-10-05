import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();


        for (int i = 0; i < p; i++) {
            int t = sc.nextInt();

            int[] arr = new int[20];
            for (int j = 0; j < 20; j++) {
                arr[j] = sc.nextInt();
            }

            // 삽입정렬
            int ans = insertionSort(arr);
            System.out.println(t + " " + ans);
        }
    }

    static int insertionSort(int[] arr) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    cnt++;
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }

        return cnt;
    }
}
