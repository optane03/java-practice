class Vehicle
{
    int wheel;
    int speed;
    public Vehicle(int wheel, int speed)
    {
        this.wheel=wheel;
        this.speed=speed;
    }
}
class Car extends Vehicle
{
    int passenger;
    public Car(int wheel, int speed, int passenger)
    {
        super(wheel, speed);
        this.passenger=passenger;
    }
}
public class inheritence1 
{
    public static void main(String[] args) 
    {
        Car c = new Car(4,80,5);
        System.out.println("Wheel "+c.wheel);
        System.out.println("Speed "+c.speed);
        System.out.println("Passenger "+c.passenger);
    }
}
