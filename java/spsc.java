import java.util.Scanner;
import java.util.Random;

public class spsc {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int d;
        int c = 0;
        while (c == 0) 
        {
            System.out.println("Enter 0 for \bStone\b 1 for \bPaper\b 2 for \bScissor\b");
            int a = s.nextInt();
            int b = r.nextInt(3);
            System.out.println("You :" + a + " Computer :" + b);
            switch (a) {
                case 0:
                    if (b == 0) 
                    {
                        System.out.println("Match Drawn");
                    } 
                    else if (b == 1)
                    {
                        System.out.println("Computer Won");
                    } 
                    else 
                    {
                        System.out.println("You won");
                    }
                    break;
                case 1:
                    if (b == 0) 
                    {
                        System.out.println("You won");
                    } 
                    else if (b == 1) 
                    {
                        System.out.println("Match Drawn");
                    } 
                    else 
                    {
                        System.out.println("Computer won");
                    }
                    break;
                case 2:
                    if (b == 0) 
                    {
                        System.out.println("Computer won");
                    } 
                    else if (b == 1) 
                    {
                        System.out.println("You won");
                    } 
                    else 
                    {
                        System.out.println("Match Drawn");
                    }
                    break;
                default:
                    System.out.println("Not match");
            }
            System.out.println("Enter 0 to contunue 1 to exit");
            d = s.nextInt();
            if (d == 0) 
            {
                c = 0;
            } 
            else if (d == 1) 
            {
                c = 1;
            }

        }
    }
}
