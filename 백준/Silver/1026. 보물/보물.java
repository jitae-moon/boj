import java.util.*;

public class Main {
//    static int[] a;
//    static int[] b;
//    static int n;
//    static int[] permu;
//    static int[] check;
//    static int min;
//
//    static void getSum(int[] a, int[] b) {
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] * b[i] > min) return;
//            sum += (a[i] * b[i]);
//            if (sum > min) return;
//        }
//        min = sum;
//    }
//
//    static void getPermutation(int level) {
//        if (level == n) {
//            getSum(permu, b);
//        } else {
//            for (int i = 0; i < n; i++) {
//                if (check[i] == 0) {
//                    check[i] = 1;
//                    permu[level] = a[i];
//                    getPermutation(level + 1);
//                    check[i] = 0;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            ans += (a.get(i) * b.get(i));
        }
        System.out.println(ans);
    }
}
