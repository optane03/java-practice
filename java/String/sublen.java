import java.util.*;
public class sublen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 0;
        int co = 0;
        for (int i = 0; i < s.length(); i++) {
            co++;
            if(s.charAt(i)=='.'){
                if(len < co){
                    len = co;
                }
                co = 0;
            }
        }
        if(co>len){
            System.out.println(co);
        }
        else{
            System.out.println(len-1);
        }
    }
}
