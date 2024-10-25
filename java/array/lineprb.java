import java.util.*;
public class lineprb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int cou = 0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='I'){
                cou++;
                temp2=i;
            }
            if (cou == 2 && temp3 == 0) {
                temp1 = i;
                temp3=1;
            }
            i++;
        }
        if(temp1==0){
            System.out.println(temp1);
        }
        else{
            System.out.println(temp2-temp1+1);
        }
        
    }
}
