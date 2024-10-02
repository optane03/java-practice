import java.util.*;
class persq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sr = (int) Math.sqrt(n);
        if((sr*sr) == n){
            System.out.println("Success");
        }
        else{
            System.out.println("Error");
        }
    }
}