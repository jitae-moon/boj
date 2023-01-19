import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] numbers = new int[9];
        int count = 0;
        
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                count = i;
            }
        }
        
        System.out.println(max);
        System.out.println(count + 1);
        sc.close();
    }
}