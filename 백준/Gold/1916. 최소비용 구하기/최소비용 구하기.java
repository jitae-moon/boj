import java.io.*;
import java.util.*;

public class Main {
    static List<List<Node>> graph;
    static int[] dis;

    static void dijikstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dis[start] = 0;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int curVertex = cur.vertex;
            int curCost = cur.cost;
            if (curCost > dis[curVertex]) continue;
            for (Node tmp : graph.get(curVertex)) {
                if (dis[tmp.vertex] > curCost + tmp.cost) {
                    dis[tmp.vertex] = curCost + tmp.cost;
                    pq.offer(new Node(tmp.vertex, dis[tmp.vertex]));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(end, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijikstra(start);
        System.out.println(dis[end]);
    }
}

class Node implements Comparable<Node> {
    int vertex;
    int cost;

    public Node(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}
