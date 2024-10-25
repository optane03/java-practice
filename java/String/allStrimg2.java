import java.util.Scanner;
public class allStrimg2 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String here");
        String name = s.nextLine();
        String Removed = "";
        int i, count=0;
        int n = name.length();
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                Removed += name.charAt(i);
            }
            

        }   
        System.out.println("New String : "+Removed);
    }
}
