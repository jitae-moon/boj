
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        int n = sc.nextInt();
        String command = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            command = sc.next();
            if (command.equals("push")) {
                stack.push(sc.nextInt());
            } else if (command.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(stack.empty()).append("\n");
            } else {
                sb.append(stack.top()).append("\n");
            }
        }
        String ans = sb.toString();
        System.out.println(ans.toString());


    }
}

class MyStack {
    int[] arr = new int[10000];
    int idx = -1;

    public void push(int n) {
        arr[++idx] = n;
    }

    public int pop() {
        if (idx == -1) return -1;
        return arr[idx--];
    }

    public int size() {
        return idx + 1;
    }

    public int empty() {
        if (idx == -1) return 1;
        else return 0;
    }

    public int top() {
        if (idx != -1) return arr[idx];
        return -1;
    }
}
