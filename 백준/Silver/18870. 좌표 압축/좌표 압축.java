

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i : list) {
            list2.add(i);
        }
        Map<Integer, Integer> map = new HashMap<>();

        Collections.sort(list);
        int idx = 1;
        map.put(list.get(0), 0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                continue;
            } else {
                map.put(list.get(i), idx);
                idx++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : list2) {
            ans.add(map.get(i));
        }

        for (int i : ans) {
            bw.write(i + " ");
        }
        bw.flush();



    }
}
