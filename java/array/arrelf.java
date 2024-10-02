import java.util.*;
class arrelf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum = s.nextInt();
        System.out.println("Enter size of array");
        int n = s.nextInt();

        int i=0,j;
        int cou=0;
        
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for ( j = 0; j < n; j++) {
            arr[j]=s.nextInt();
        }
        
        for ( i = 0; i < n-1; i++){
            for ( j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==sum){
                    cou++;
                }
            }
        }

        if(cou==0){
            System.out.println("No pair");
        }
        else{
            System.out.println(cou+ " pair");
        }
    }
}