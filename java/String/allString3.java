import java.util.Scanner;
public class allString3 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = s.nextLine();
        int i;
        for(i=0;i<a.length();i++)
        {
            if(a.charAt(0)!=' ')
            {
                System.out.println(a.charAt(0));
            }
            if(a.charAt(i)==' ')
            {
                System.out.println(a.charAt(i+1));
            }
        }
    }
}
