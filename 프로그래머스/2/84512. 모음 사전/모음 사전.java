import java.util.*;
class Solution {
    static char[] alpha;
    static int n = 5;
    static int cnt;
    static char[] ans;
    static List<String> list;
    
    public int solution(String word) {
        alpha = new char[]{'A', 'E', 'I', 'O', 'U'};
        list = new ArrayList<>();
        dfs(0, "");
        cnt = 0;
        for (String str : list) {
            cnt++;
            if (str.equals(word)) break;
        }
        
        return cnt - 1;
        
    }
    
    static void dfs(int level, String word) {
        list.add(word);
        if (level == 5) return;
        else {
            for (int i = 0; i < 5; i++) {
                dfs(level + 1, word + alpha[i]);
            }
        }
    }
    
}