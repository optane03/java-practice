import java.util.*;
public class findminar {
    public static void main(String[] args){
        int n = 5;
        int cou=0;
        int arr[] = {1,3,4,6,16};
        int f = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if((arr[i]+arr[j])<=f){
                    cou++;
                }
            }
        }
        System.err.println(cou);
    }
}
