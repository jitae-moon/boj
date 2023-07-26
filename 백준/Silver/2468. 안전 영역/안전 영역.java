
import java.util.*;

public class Main {
    static int n;
    static int height;
    static int[][] board;
    static int[][] vis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Pair> queue = new LinkedList<>();

    static void dfs(Pair pair) {
        int x = pair.x;
        int y = pair.y;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] <= height && vis[nx][ny] == 0) {
                vis[nx][ny] = 1;
                dfs(new Pair(nx, ny));
            }
        }

    }

    static void bfs(Pair pair) {
        queue.clear();
        queue.offer(pair);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair cur = queue.poll();
                int x = cur.x;
                int y = cur.y;
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && vis[nx][ny] == 0) {
                        queue.offer(new Pair(nx, ny));
                        vis[nx][ny] = 1;
                    }
                }

            }
        }

    }

    static int basicLogic() {
        for (int i = 0; i < n; i++) Arrays.fill(vis[i], 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] <= height) {
                    vis[i][j] = 1;
                    dfs(new Pair(i, j));
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0) {
                    bfs(new Pair(i, j));
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        vis = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j] = sc.nextInt();
        }


        int ans = 0;
        for (height = 0; height <= 100; height++) {
            int tmp = basicLogic();
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);




    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
