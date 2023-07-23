
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                if (pq.isEmpty()) ans.add(0);
                else ans.add(pq.poll().x);
            } else {
                pq.offer(new Num(tmp));
            }
        }

        for (int i : ans) {
            bw.write(i + "\n");
        }
        bw.flush();


    }
}

class Num implements Comparable<Num> {
    int x;

    public Num(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(Num tmp) {
        if (Math.abs(x) == Math.abs(tmp.x)) {
            return x - tmp.x;
        } else {
            return Math.abs(x) - Math.abs(tmp.x);
        }
    }
}
