import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] time = new int[101];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minTime = 101, maxTime = 0;
        for (int i = 0; i < 3; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            if (start < minTime) minTime = start;

            if (end > maxTime) maxTime = end;

            for (int j = start; j < end; j++) {
                time[j]++;
            }
        }

        int answer = 0;
        for (int i = minTime; i < maxTime; i++) {
            if (time[i] == 1) {
                answer += (a * 1);
            } else if (time[i] == 2) {
                answer += (b * 2);
            } else if (time[i] == 3) {
                answer += (c * 3);
            }
        }

        System.out.println(answer);
    }
}
