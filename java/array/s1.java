import java.util.*;
class s1 {
    public static void main(String[] args) {
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int arr2[]={31,29,31,30,31,30,31,31,30,31,30,31};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter date in this format: \"DD-MM-YYYY\"");
        String s = sc.next();
        
        int n1 = Integer.parseInt(s.substring(3,5));
        int n2 = Integer.parseInt(s.substring(6));
        
        int a = leapyear(n2);
        
        if(a==1){
            System.out.println(arr2[n1-1]);
        }
        else if(a==0){
            System.out.println(arr[n1-1]);
        }
    }
    public static int leapyear(int n){
        if(n%400==0){
            return 1;
        }
        else if(n%100==0){
            return 0;
        }
        else if(n%4==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}