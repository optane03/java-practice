import java.util.*;
class prinsamarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int n = s.nextInt();
        int i = 0;
        int j,re;
        while(n!=0){
            re=n%10;
            arr[i]=re;
            i++;
            n/=10;
        }
        System.out.println("The length of the array is "+i);
        for(j=arr.length-1;j>=0;j--){
            if(arr[j]!=0)
            {
                System.out.print(arr[j]+" "); 
            }
        }
    }
}