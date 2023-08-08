
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int r, c;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int[] vis = new int[26];
    static int[][] dis;
    static int ans;

    static void dfs(Pair pair, int cnt) {
        int x = pair.x;
        int y = pair.y;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < r && ny >= 0 && ny < c && vis[board[nx][ny] - 'A'] == 0) {
                vis[board[nx][ny] - 'A'] = 1;
                dis[nx][ny] = dis[x][y] + 1;
                cnt++;
                dfs(new Pair(nx, ny), cnt);
                cnt--;
                vis[board[nx][ny] - 'A'] = 0;
            }
        }
//        ans = Math.max(ans, Arrays.stream(dis).flatMapToInt(Arrays::stream).max().getAsInt());
        ans = Math.max(ans, cnt);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = br.readLine().split(" ");
        r = Integer.parseInt(strArr[0]);
        c = Integer.parseInt(strArr[1]);
        board = new char[r][c];
        for (int i = 0; i < r; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < c; j++) {
                board[i][j] = tmp.toCharArray()[j];
            }
        }
        dis = new int[r][c];

        vis[board[0][0] - 'A'] = 1;
        dis[0][0] = 1;
        dfs(new Pair(0, 0), 1);
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