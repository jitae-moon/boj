import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int find(int n) {
        if (n == arr[n]) return arr[n];
        else return arr[n] = find(arr[n]);
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);

        if (findA != findB) arr[findA] = findB;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (order == 1) {
                int findA = find(a);
                int findB = find(b);
                if (findA == findB) bw.write("YES\n");
                else bw.write("NO\n");
            } else {
                union(a, b);
            }

        }

        bw.flush();
    }
}
