import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);

        HashMap<String, Integer> map = new HashMap<>();
        while (st.hasMoreTokens()) {
            String key = st.nextToken().toLowerCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int ans = 0;
        for (String key : map.keySet()) {
            ans += map.get(key);
        }

        System.out.println(ans);
    }
}
