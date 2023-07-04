

import java.util.*;

public class Main {
    static int n;
    static int m;
    static int max;
    static int[][] board;
    static int[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    static void bfs(int x, int y) {
        Queue<Pair> queue = new LinkedList<>();
        int area = 0;
        queue.offer(new Pair(x, y));
        visited[x][y] = 1;
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            area++;
            x = cur.x;
            y = cur.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (board[nx][ny] == 1 && visited[nx][ny] == 0) {
                    queue.offer(new Pair(nx, ny));
                    visited[nx][ny] = 1;
                }
            }
        }
        max = Math.max(max, area);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) board[i][j] = sc.nextInt();
        }

        visited = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0 || visited[i][j] == 1) continue;
                bfs(i, j);
                cnt++;
            }
        }

        System.out.println(cnt);
        System.out.println(max);

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