public class sample 
{
    public static void main(String args[]) {
        Main obj = new Main();
        obj.age = 60;
        obj.name = "Tanay";
        System.out.println("NAME  " + obj.name);
        System.out.println("AGE " + obj.age);
    }

}

class Main 
{
    int age;
    String name;
}
