class Circle
{
    int rad;
    public Circle(int rad)
    {
        this.rad=rad;
    }
    public double getArea()
    {
        return 3.14*this.rad*this.rad;
    }
}
class Cylender extends Circle
{
    int height;
    public Cylender(int rad, int height)
    {
        super(rad);
        this.height=height;
    }
    public double getArea()
    {
        double base = super.getArea();
        double sa = 2*(3.14)*rad*height;
        return (2*base)+(sa);
    }
}
public class inheritence2 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5);
        Cylender cy = new Cylender(4,5);
        System.out.println("Circle "+c.getArea());
        System.out.println("Cylender "+cy.getArea());
    }
}
