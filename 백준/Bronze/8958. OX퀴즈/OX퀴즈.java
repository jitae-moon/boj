import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        int n = sc.nextInt();
        int temp;
        
        for (int i = 0; i < n; i++) {
            result = 0;
            char[] scores = sc.next().toCharArray();
            temp = 0;
            for (int j = 0; j < scores.length; j++) {
                
                if (scores[j] == 'O') {
                    temp++;
                    result += temp;
                } else {
                    temp = 0;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}