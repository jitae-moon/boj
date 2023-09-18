import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            int startTime = Integer.parseInt(tmp[0]);
            int endTime = Integer.parseInt(tmp[1]);

            list.add(new Meeting(startTime, endTime));
        }

        // 끝나는 시간대로 정렬
        Collections.sort(list);
        int tmpEndTime = 0;
        int ans = 0;

        for (Meeting meeting : list) {
            if (meeting.startTime >= tmpEndTime) {
                tmpEndTime = meeting.endTime;
                ans++;
            }
        }

        System.out.println(ans);
    }
}

class Meeting implements Comparable<Meeting> {
    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Meeting tmp) {
        if (this.endTime == tmp.endTime) {
            return this.startTime - tmp.startTime;
        } else {
            return this.endTime - tmp.endTime;
        }
    }
}
