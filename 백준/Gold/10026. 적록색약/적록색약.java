

import java.util.*;

public class Main {
    static int n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static void bfs(Pair pair, char c, char[][] board) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(pair);
        board[pair.x][pair.y] = 'O';
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair cur = queue.poll();
                int x = cur.x;
                int y = cur.y;
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == c) {
                        queue.offer(new Pair(nx, ny));
                        board[nx][ny] = 'O';

                    }
                }

            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = tmp.toCharArray()[j];
            }
        }

        char[][] board2 = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R' || board[i][j] == 'G') {
                    board2[i][j] = 'X';
                }
            }
        }

        int cnt = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 'O') {
                    bfs(new Pair(i, j), board[i][j], board);
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board2[i][j] != 'O') {
                    bfs(new Pair(i, j), board2[i][j], board2);
                    cnt2++;
                }
            }
        }
        System.out.println(cnt + " " + cnt2);


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