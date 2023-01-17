import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        int[] numbers;
        n = sc.nextInt();
        x = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < x) {
                System.out.print(numbers[i] + " ");
            }
        }
        sc.close();
    }
}