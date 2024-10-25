import java.util.*;
public class elfind {
    public static void main(String[] args){
        int res = 0;
        int[] arr = {6,5,7,7,5};
        for(int num: arr){
            res ^= num;
        }
        System.out.println(res);
    }
}
