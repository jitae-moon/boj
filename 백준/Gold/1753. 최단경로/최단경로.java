import java.io.*;
import java.util.*;

public class Main {
    static int[] costs;
    static List<List<Node>> graph;

    static void dijkstra(int n) {
        costs[n] = 0; // 출발지점
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(n, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int curVal = cur.value;
            int curCost = cur.cost;

            for (Node tmp : graph.get(curVal)) {
                int nextVal = tmp.value;
                int toNextCost = curCost + tmp.cost;

                if (costs[nextVal] > toNextCost) {
                    costs[nextVal] = toNextCost;
                    pq.offer(new Node(nextVal, toNextCost));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        // 최단거리 배열 생성
        costs = new int[v + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(end, cost));
        }

        dijkstra(k);

        for (int i = 1; i <= v; i++) {
            if (costs[i] == Integer.MAX_VALUE) {
                bw.write("INF\n");
            } else {
                bw.write(costs[i] + "\n");
            }
        }

        bw.flush();
    }
}

class Node implements Comparable<Node> {
    int value;
    int cost;

    public Node(int value, int cost) {
        this.value = value;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}
