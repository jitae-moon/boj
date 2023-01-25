import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        while (true) {
            str = sc.next();
            if (Integer.valueOf(str) == 0) {
                break;
            }
            
            String temp = new StringBuilder(str).reverse().toString();
            if (str.equals(temp)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}