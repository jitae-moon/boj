import java.util.*;
class Solution {
    static int ans;
    static int[] check;
    static void dfs(int level, int sum, int target, int[] numbers) {
        if (level == numbers.length) {
            if (sum == target) {
                ans++;
            }
        } else {
                dfs(level + 1, sum + numbers[level], target, numbers);
                dfs(level + 1, sum - numbers[level], target, numbers);
        }
    }
    
    public int solution(int[] numbers, int target) {
        check = new int[numbers.length];
        dfs(0, 0, target, numbers);
        
        return ans;
    }
}