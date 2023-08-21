
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 1부터 n번까지 queue에 넣는다.
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        // queue가 빈 상태가 될때까지 k번째항을 계속 꺼냄
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            int tmp = queue.poll();
            // 제일 마지막 숫자는 , 없이 출력해야됨.
            if (!queue.isEmpty()) {
                bw.write(tmp + ", ");
            } else {
                bw.write(tmp + "");
            }
        }
        bw.write(">");
        bw.flush();
    }
}
