import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE, sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
                if (number < min) min = number;
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}