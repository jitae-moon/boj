
import java.util.*;

public class Main {
    static int n, m;
    static int[][] board;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    static void bfs(Pair pair) {
        Queue<Pair> queue = new LinkedList<>();
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
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1) {
                        board[nx][ny] = 0;
                        dis[nx][ny] = dis[x][y] + 1;
                        queue.offer(new Pair(nx, ny));
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = tmp.toCharArray()[j] - '0';
            }
        }
        board[0][0] = 1;
        dis[0][0] = 1;
        bfs(new Pair(0, 0));
        System.out.println(dis[n-1][m-1]);

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