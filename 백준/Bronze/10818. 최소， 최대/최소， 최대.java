import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } 
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.print(min + " " + max);
        sc.close();
    }
}