import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] parents = new int[n + 1];

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            list.get(node1).add(node2);
            list.get(node2).add(node1);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n + 1];
        queue.offer(1);
        visited[1] = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                for (int node : list.get(cur)) {
                    if (visited[node] == 0) {
                        visited[node] = 1;
                        parents[node] = cur;
                        queue.offer(node);
                    }
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            bw.write(parents[i] + "\n");
        }

        bw.flush();
    }
}

