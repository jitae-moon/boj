import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int[] cars = new int[5];
        for (int i = 0; i < cars.length; i++) cars[i] = sc.nextInt();
        
        int ans = 0;
        for (int i : cars) {
            if (i == date) ans++;
        }
        
        System.out.println(ans);
    }
}