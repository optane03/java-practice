import java.util.Scanner;
public class findnum 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("enter array element");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter Search value");
        int n = s.nextInt();
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]==n) 
            {
                System.out.println("Number found!!");               
            }
        }
    }   
}

