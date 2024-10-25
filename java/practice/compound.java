import java.util.Scanner;
public class compound 
{
    public static void main(String arg[]) 
    {
        Scanner sc= new Scanner(System.in);
        double a, temp=1;
        System.out.println("Enter Curret Balance");
        int p= sc.nextInt();
        System.out.println("Enter interest rate");
        double r= sc.nextDouble();
        r=r/100;
        System.out.println("Enter number of times interest applied per time period");
        int n= sc.nextInt();
        System.out.println("Enter number of time period");
        int t= sc.nextInt();

        double sum= (1+(r/n));
        for(int i=1;i<=n*t;i++)
        {
            temp=temp*sum;
        }
        a= p*temp;
        System.out.println("The Final ammount\t"+a);



        
    }    
}
