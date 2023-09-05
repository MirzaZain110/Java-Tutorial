import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling2 {

    public static void main(String[] args)
    {
        // Creating new file in folder .
        try
        {   
            File obj = new File("handlingfile.txt");
            File myObj = new File("handlingfile.txt");
            
            Scanner reader = new Scanner(obj);
            if (myObj.exists()) {
                System.out.println("File name : " + myObj.getName());
                System.out.println("Absolute path : " + myObj.getAbsolutePath());
                System.out.println("Writeable : " + myObj.canWrite());
                System.out.println("Readable : " + myObj.canRead());
                System.out.println("File size in bytes : " + myObj.length());
                               System.out.println("Mkdirs : " + myObj.mkdirs()); 
              } else {
                System.out.println("The file does not exist.");
              }
            System.out.println("Data of File :");
            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }
                reader.close();
        } 
        catch(FileNotFoundException e)
        {
                System.err.println("An Error !!!");
                e.printStackTrace(); // Use to Show exception 
        }
        
    }
    
}
