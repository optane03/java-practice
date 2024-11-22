import java.util.*;
public class matchst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2=s;
        String s3="";
        
        for (int i = 0; i < s1.length(); i++) {
            s3="";
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)!=s2.charAt(j)){
                    s3 = s3+s2.charAt(j);
                }
            }
            s2=s3;
        }
        System.out.println(s2);
    }
}
