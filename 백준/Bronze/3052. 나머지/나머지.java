import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] remainders = new int[42];
        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            remainders[numbers[i] % 42]++;
        }
        for (int i = 0; i < remainders.length; i++) {
            if (remainders[i] != 0) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}