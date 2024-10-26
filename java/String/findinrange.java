import java.util.*;
public class findinrange {
    public static int calculate(int k, int i){
        int s=0,r;
        while(i!=0){
            r = i%10;
            if (r==k){
                s++;
            }
            i/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += calculate(k, i);
        }

        System.out.println(sum);
    }
}
