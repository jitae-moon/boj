import java.util.*;

public class Main {
    static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    static int solve(int n) {
        for (int i = 1; i <= n; i++) {
            if (i + getSum(i) == n) {
                return i;
            }
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = solve(n);
        System.out.println(ans);
    }
}