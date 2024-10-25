import java.util.*;
class Rectangle
{
    int h, w;
    Rectangle(int h, int w)
    {
        this.h=h;
        this.w=w;
    }
    public void getAreaPerimeter()
    {
        System.out.println("Area "+h*w);
        System.out.println("Perimeter "+2*(h+w));
    }
}
public class myConstructor2 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(4,5);
        r1.getAreaPerimeter();
        Rectangle r2 = new Rectangle(6,5);
        r2.getAreaPerimeter();
    }
}
