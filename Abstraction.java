abstract class person{
    public void display(){
        System.out.println("Abstract class ");
    }
}
interface man{
    public void details();
}
class employee extends person implements man{
    public void details()
    {
        System.out.println("Name : Zain \n Age : 12 \n");
    }
}
public class Abstraction {
    public static void main(String[] args)
    {
        // person p = new person();
        // p.display(); // not possible due to abstract class
        employee e = new employee();
        e.details();
        e.display();
    }
}
