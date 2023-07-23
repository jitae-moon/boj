
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                if (pq.isEmpty()) ans.add(0);
                else ans.add(pq.poll());
            } else {
                pq.offer(tmp);
            }
        }
        for (int i : ans) {
            bw.write(i + "\n");
        }
        bw.flush();


    }
}
