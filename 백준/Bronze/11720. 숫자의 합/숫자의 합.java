import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] numArr = new char[n];
        int sum = 0;
        
        
        numArr = sc.next().toCharArray();
        for (int i = 0; i < numArr.length; i++) {
            sum += (numArr[i] - '0');
        }
        System.out.println(sum);
        sc.close();
    }
}