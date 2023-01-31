import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();
        
        System.out.println(num1 * Integer.valueOf(num2.charAt(2) - '0'));
        System.out.println(num1 * Integer.valueOf(num2.charAt(1) - '0'));
        System.out.println(num1 * Integer.valueOf(num2.charAt(0) - '0'));
        System.out.println(num1 * Integer.valueOf(num2));
        sc.close();
    }
}