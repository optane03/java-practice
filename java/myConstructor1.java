class Box
{
    int h, w, d;
    Box()
    {
        this.h=1;
        this.w=1;
        this.d=1;
    }
    Box(int h, int w, int d)
    {
        this.h=h;
        this.w=w;
        this.d=d;
    }
    Box(Box b)
    {
        this.h=b.h;
        this.w=b.w;
        this.d=b.d;
    }
    public void display()
    {
        System.out.println("Height "+this.h+" Width "+this.w+" Depth "+this.d);
    }
}
public class myConstructor1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5,6,3);
        Box b3 = new Box(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}
