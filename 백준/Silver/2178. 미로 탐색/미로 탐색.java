
import java.util.*;

public class Main {
    static int[][] board;
    static int[][] visited;
    static int[][] distance;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int bfs(int x, int y) {
        int max = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(x, y));
        visited[x][y] = 1;
        distance[x][y] = 1;
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            x = cur.x;
            y = cur.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx > n || ny < 0 || ny > m) continue;

                if (board[nx][ny] == 1 && visited[nx][ny] == 0) {
                    queue.offer(new Pair(nx, ny));
                    visited[nx][ny] = 1;
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }
        return distance[n][m];
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n + 1][m + 1];
        visited = new int[n + 1][m + 1];
        distance = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String tmp = sc.next();
            for (int j = 1; j <= m; j++) board[i][j] = tmp.charAt(j-1) - '0';
        }

        int ans = bfs(1, 1);
        System.out.println(ans);

    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
