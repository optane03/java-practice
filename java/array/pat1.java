import java.util.*;
public class pat1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int i,j;

        for ( i = 1; i <= n; i++) {
            for( j = 1; j<=i;j++){
                if(j==1)
                {
                    System.out.print(i);
                }
                else{
                    System.out.print("*"+i);
                }
            }
            System.out.println("");
        }
        for ( i = n; i >= 1; i--) {
            for( j = i; j>=1;j--){
                if(j==1)
                {
                    System.out.print(i);
                }
                else{
                    System.out.print(i+"*");
                }
            }
            System.out.println("");
        }
    }
}
