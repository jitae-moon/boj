
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        MyQueue queue = new MyQueue();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            if (tmp[0].equals("push")) {
                queue.push(Integer.parseInt(tmp[1]));
            } else {
                String instruct = tmp[0];

                if (instruct.equals("pop")) {
                    bw.write(queue.pop() + "\n");
                } else if (instruct.equals("size")) {
                    bw.write(queue.size() + "\n");
                } else if (instruct.equals("front")) {
                    bw.write(queue.front() + "\n");
                } else if (instruct.equals("back")) {
                    bw.write(queue.back() + "\n");
                } else {
                    bw.write(queue.empty() + "\n");
                }
            }
        }

        bw.flush();
    }
}

class MyQueue {

    private List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
    }

    public void push(int n) {
        list.add(n);
    }

    public int pop() {
        if (list.size() == 0) {
            return -1;
        } else {
            int tmp = list.get(0);
            list.remove(list.indexOf(tmp));

            return tmp;
        }
    }

    public int size() {
        return list.size();
    }

    public int empty() {
        if (list.size() == 0) return 1;
        else return 0;
    }

    public int front() {
        if (list.size() == 0) return -1;
        else return list.get(0);
    }

    public int back() {
        if (list.size() == 0) return -1;
        else return list.get(list.size() - 1);
    }
}
