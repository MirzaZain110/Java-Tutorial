import java.io.File;
public class FileHandling3 {
    public static void main(String[] args)
    {
        File obj = new File("handlingfile.txt");
        if(obj.delete())
        {
            System.out.println("File Delete : "+ obj.getName());
        }
        else{
            System.out.println("Fail to delete");
        }
    }
}
