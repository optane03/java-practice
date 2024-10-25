import java.util.*;
public class main {
    public static boolean isPerfectSquare(int n) {
        for(int i=0; i*i<=n; i++) {
            if(i*i == n) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        n = s.nextInt();

        if(isPerfectSquare(n)) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not perfect square ");
        }
    }
}
