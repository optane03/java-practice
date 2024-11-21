import java.util.*;
public class prtnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prt(n);
    }
    public static void prt(int n){
        int co = cont(n);
        if(n==0){
            System.out.println(n);
        }
        else if(co==1){
            System.out.println(n);
        }
        else if(co>1){
            if(n%2==0){
                prt((n-2)/2);
            }
            else{
                prt(n/2);
            }
        }
        
    }
    public static int cont(int i){
        int co=0;
        while(i!=0){
            ++co;
            i/=10;
        }
        return co;
    }
    
}
