import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (reverse(a) > reverse(b)) {
            System.out.println(reverse(a));
        } else {
            System.out.println(reverse(b));
        }
    }
    
    static int reverse(int number) {
        int result = 0;
        while (number > 0) {
            result = (result * 10) + (number % 10);
            number /= 10;
        }
        return result;
    }
}