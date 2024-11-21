import java.util.*;
public class prinalpha {
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prints(n, arr);
    }
    public static void prints(int n, char[] arr){
        
        if(n>26){
            int re = n%26;
            int x = n/26;
            
            if(re == 0){
                prints(x-1, arr);
                System.out.print(arr[26-1]);
            }
            else{
                prints(x, arr);
                System.out.print(arr[re-1]);
            }
        }
        else{
            System.out.print(arr[n-1]);
        }
        
    }
}