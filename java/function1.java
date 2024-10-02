import java.util.*;
public class function1 
{
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);

    }
}
