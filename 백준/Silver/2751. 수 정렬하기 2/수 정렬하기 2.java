import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(); // Tim sort 활용하기 위해

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }

        Collections.sort(list);

        for (int num : list) {
            bw.write(num + "\n");
        }

        bw.flush();
    }
}