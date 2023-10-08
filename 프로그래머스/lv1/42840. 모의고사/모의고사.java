import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (student1[(i + student1.length) % student1.length] == answers[i]) cnt[0]++;
            if (student2[(i + student2.length) % student2.length] == answers[i]) cnt[1]++;
            if (student3[(i + student3.length) % student3.length] == answers[i]) cnt[2]++;
        }
        List<Integer> ans = new ArrayList<>();
        
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (max < cnt[i]) max = cnt[i];
        }
        
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max) ans.add(i);
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i) + 1;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}