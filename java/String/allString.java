import java.util.Scanner;
public class allString 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String here");
        String name = s.nextLine();
        int i, count=0;
        int n = name.length();
        for(i=0;i<n;i++)
        {
            char d = name.charAt(i);
            boolean c = Character.isUpperCase(d);
            if(c==true)
            {
                System.out.println(name.charAt(i));
                count++;
            }

        }   
        System.out.println("\nTotal Number:"+count);
    }
}
