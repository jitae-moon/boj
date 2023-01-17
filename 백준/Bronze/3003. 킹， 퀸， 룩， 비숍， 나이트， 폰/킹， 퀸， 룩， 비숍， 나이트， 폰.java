import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int king = 1, queen = 1, rook = 2, bishop = 2, knight = 2, pawn = 8;
        
        int userKing, userQueen, userRook, userBishop, userKnight, userPawn;
        
        userKing = sc.nextInt();
        userQueen = sc.nextInt();
        userRook = sc.nextInt();
        userBishop = sc.nextInt();
        userKnight = sc.nextInt();
        userPawn = sc.nextInt();
        
        System.out.printf("%d %d %d %d %d %d", 
                         king - userKing, queen - userQueen, rook - userRook, bishop - userBishop,
                         knight - userKnight, pawn - userPawn);
    }
}