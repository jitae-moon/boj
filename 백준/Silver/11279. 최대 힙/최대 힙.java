import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                if (pq.isEmpty()) {
                    list.add(0);
                } else {
                    list.add(pq.poll());
                }
            } else {
                pq.offer(tmp);
            }
        }
        for (int i : list) {
            bw.write(i + "\n");
        }
        bw.flush();

    }
}
