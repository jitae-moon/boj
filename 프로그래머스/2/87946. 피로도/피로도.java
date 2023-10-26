class Solution {
    static int n;
    static int[] permu;
    static int[] check;
    static int ans;
    public int solution(int k, int[][] dungeons) {
        n = dungeons.length; 
        permu = new int[n];
        check = new int[n];
        ans = 0;
        getPermutation(0, dungeons, k);
        
        return ans;
    }
    
    static void getPermutation(int level, int[][] dungeons, int k) {
        if (level == n) {
            checkFatigability(dungeons, k);
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    permu[level] = i;
                    getPermutation(level + 1, dungeons, k);
                    check[i] = 0;
                }
            }
        }
        
    }
    
    static void checkFatigability(int[][] dungeons, int k) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (dungeons[permu[i]][0] > k) {
                ans = Math.max(ans, cnt);
                return;
            } else {
                cnt++;
                k -= dungeons[permu[i]][1];
            }
            ans = Math.max(ans, cnt);
        }
    }
}