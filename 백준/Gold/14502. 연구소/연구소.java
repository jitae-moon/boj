
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] original;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int ans = 0;

    // 바이러스 번지게 하는 로직
    static void bfs() {
        int[][] copy = new int[n][m];
        // 배열 깊은 복사
        for (int i = 0; i < n; i++) {
            copy[i] = original[i].clone();
        }

        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 2) {
                    // 주위 전부 2로 만들어버리기(바이러스)
                    queue.offer(new Pair(i, j));

                    while (!queue.isEmpty()) {
                        int size = queue.size();

                        for (int k = 0; k < size; k++) {
                            Pair cur = queue.poll();
                            int x = cur.x;
                            int y = cur.y;
                            for (int l = 0; l < 4; l++) {
                                int nx = x + dx[l];
                                int ny = y + dy[l];
                                if (nx >= 0 && nx < n && ny >= 0 && ny < m && copy[nx][ny] == 0) {
                                    copy[nx][ny] = 2;
                                    queue.offer(new Pair(nx, ny));
                                }
                            }
                        }
                    }
                }
            }
        }

        // 0개수 세기
        ans = Math.max(getCount(copy), ans);
    }

    static int getCount(int[][] board) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (board[i][j] == 0) cnt++;
        }
        return cnt;
    }

    static void dfs(int cnt) {
        if (cnt == 3) {
            bfs();
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (original[i][j] == 0) {
                        original[i][j] = 1;
                        dfs(cnt + 1);
                        original[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        original = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                original[i][j] = sc.nextInt();
            }
        }

        dfs(0);
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