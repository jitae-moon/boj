import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[3];
        for (int i = 0; i < 3; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        if (numArr[0] == numArr[1] && numArr[1] == numArr[2]) {
            System.out.println(10000 + numArr[0] * 1000);
        } else if (numArr[0] == numArr[1] || numArr[1] == numArr[2]) {
            System.out.println(1000 + numArr[1] * 100);
        } else {
            System.out.println(numArr[2] * 100);
        }
        sc.close();
    }
}