import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, new CompareStr());

        for (String str : list) {
            System.out.println(str);
        }

    }
}

class CompareStr implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1.length() - str2.length() == 0) {
            return String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
        } else {
            return str1.length() - str2.length();
        }
    }
}