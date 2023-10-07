
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<int[]> list;
    static int n;
    static int[][] board;
    static int[] combination;
    // 추후 조합의 나머지 인원 구할 때 사용할 배열
    static int[] check;
    static int minScore = Integer.MAX_VALUE;
    static void getCombination(int level, int start) {
        if (level == n / 2) {
            int[] team = new int[n / 2];
            for (int i = 0; i < team.length; i++) {
                team[i] = combination[i];
            }
            list.add(team);
        } else {
            for (int i = start; i <= n; i++) {
                combination[level] = i;
                getCombination(level + 1, i + 1);
            }
        }
    }

    static void getPair(int[] team, List<int[]> pairs, int level, int start, int[] tmp) {
        if (level == 2) {
            int[] realTeam = new int[2];
            System.arraycopy(tmp, 0, realTeam, 0, 2);
            pairs.add(realTeam);
        } else {
            for (int i = start; i < team.length; i++) {
                tmp[level] = team[i];
                getPair(team, pairs, level + 1, i + 1, tmp);
            }
        }

    }

    static int getScore(int[] team) {
        int score = 0;
        List<int[]> pairs = new ArrayList<>();
        int[] tmp = new int[2];
        getPair(team, pairs, 0, 0, tmp);
        for (int[] arr : pairs) {
            int i = arr[0];
            int j = arr[1];
//            System.out.println("i, j" + " " + i + ", " + j);
            score += board[i][j] + board[j][i];
        }

        return score;
    }

    static void getOtherTeam(int[] teamStart) {
        Arrays.fill(check, 0);
        for (int i : teamStart) check[i] = 1;
//        System.out.println(Arrays.toString(check));
        int[] teamLink = new int[teamStart.length];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (check[i] == 0) {
                teamLink[idx++] = i;
            }
        }
//        System.out.println("teamStart: " + Arrays.toString(teamStart));
//        System.out.println("teamLink: " + Arrays.toString(teamLink));
        int startScore = getScore(teamStart);
//        System.out.println("teamStartscore: " + startScore);
        int linkScore = getScore(teamLink);
//        System.out.println("teamLinkscore: " + linkScore);
        minScore = Math.min(minScore, Math.abs(startScore - linkScore));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();
        n = sc.nextInt();
        board = new int[n+1][n+1];
        combination = new int[n / 2];
        check = new int[n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        getCombination(0, 1);
        for (int[] team : list) getOtherTeam(team);

//        System.out.println("minScore: " + minScore);
        System.out.println(minScore);
    }

}
