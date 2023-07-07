
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String tmp = sc.next();
            if (tmp.equals("enter")) {
                map.put(name, map.getOrDefault(map.get(name), 0) + 1);
            } else {
                map.put(name, map.get(name) - 1);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                ans.add(key);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        for (String str : ans) {
            System.out.println(str);
        }

    }
}
