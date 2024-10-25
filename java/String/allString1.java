import java.util.Scanner;
public class allString1 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String here");
        String name = s.nextLine();
        System.out.println("Enter the position of letter you want to delete:");
        int m = s.nextInt();
        StringBuilder name1= new StringBuilder(name);
        name1.deleteCharAt(m);
        System.out.println(name1);
    }
}
