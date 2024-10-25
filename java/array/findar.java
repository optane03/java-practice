import java.util.*;
public class findar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        int i, f=-1,l=-1;
        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter required number");
        int req = s.nextInt();
        for(i=0;i<n;i++){
            if(req==arr[i]){
                if(f==-1){
                    f=i;
                }
                l=i;
            }
        }
        if(f==-1){
            System.out.println("No Occurance");
        }
        else{
            System.out.println("First Index:"+f);
            System.out.println("Last Index:"+l);
        }
    }
}
