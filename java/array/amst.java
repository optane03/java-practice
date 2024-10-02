import java.util.*;
public class amst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int n = s.nextInt();
        int i = 0;
        int t=n;
        double sum = 0, temp;
        int j,re;
        while(n!=0){
            re=n%10;
            arr[i]=re;
            i++;
            n/=10;
        }
        for (j=0;j<i;j++) {
            temp = arr[j];
            sum = sum + Math.pow(temp,i);
        }
        if(t==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
