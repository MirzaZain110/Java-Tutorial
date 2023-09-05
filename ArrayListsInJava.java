import java.util.ArrayList;
public class ArrayListsInJava {
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mehran");
        cars.add("Alto");
        System.out.println(cars);
        ArrayList<Integer> val = new ArrayList<Integer>();
        val.add(120);
        val.add(121);
        val.add(122);
        val.add(123);
        val.add(124);
        for(int i=0;i<val.size();i++)
        {
            System.out.println(i + ".  Val : "+ val.get(i));
        }
    }
}