import java.util.Scanner;
public class uplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1;
        int co1=0;
        int co2=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                co1++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                co2++;
            }
        }
        if(co1>co2){
            s1 = s.toLowerCase();
        }
        else{
            s1 = s.toUpperCase();
        }
        System.out.println(s1);
    }
}
