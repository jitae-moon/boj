import java.util.*;

//public class Main {
//    static int n;
//    static int[] dx = {-1, 0, 1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static List<Integer> list = new ArrayList<>();
//    static int[][] board;
//
//    static void bfs(Pair pair) {
//        Queue<Pair> queue = new LinkedList<>();
//        queue.offer(new Pair(pair.x, pair.y));
//        int cnt = 0;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Pair cur = queue.poll();
//                int x = cur.x;
//                int y = cur.y;
//                cnt++;
//                for (int j = 0; j < 4; j++) {
//                    int nx = x + dx[j];
//                    int ny = y + dy[j];
//
//                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
//                        board[nx][ny] = 0;
//                        queue.offer(new Pair(nx, ny));
//                    }
//                }
//            }
//        }
//        list.add(cnt);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = Integer.parseInt(sc.nextLine());
//        board = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            String tmp = sc.nextLine();
//            for (int j = 0; j < n; j++) {
//                board[i][j] = tmp.toCharArray()[j] - '0';
//            }
//        }
//
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (board[i][j] == 1) {
//                    board[i][j] = 0;
//                    bfs(new Pair(i, j));
//                    ans++;
//                }
//            }
//        }
//        Collections.sort(list);
//        System.out.println(ans);
//        for (int i : list) {
//            System.out.println(i);
//        }
//    }
//}



public class Main {
    static int n;
    static int[][] board;
    static int[] cnt;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] vis;
    static int idx;

    static void dfs(Pair pair) {
        cnt[idx]++;
        int x = pair.x;
        int y = pair.y;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && vis[nx][ny] == 0 && board[nx][ny] == 1) {
                vis[nx][ny] = 1;
                dfs(new Pair(nx, ny));
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        board = new int[n][n];
        vis = new int[n][n];
        cnt = new int[625];

        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = tmp.toCharArray()[j] - '0';
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && vis[i][j] == 0) {
                    vis[i][j] = 1;
                    dfs(new Pair(i, j));
                    ans++;
                    idx++;
                }
            }
        }
        Arrays.sort(cnt);
        System.out.println(ans);
        for (int i : cnt) {
            if (i != 0) System.out.println(i);
        }


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