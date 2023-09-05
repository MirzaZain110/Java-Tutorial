import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {

    public static void main(String[] args)
    {
        // Creating new file in folder .
        try{   
         File obj = new File("handlingfile.txt"); // To create file at specific place use this : File("C:\\Users\\MyName\\filename.txt");
         FileWriter writer = new FileWriter("handlingfile.txt",true);
         if(obj.createNewFile())
         {
            System.out.println("FileCreated : " + obj.getName() + "\nFile path : "+ obj.getPath());
         }
         else{
            System.out.println("File Already Created");
         }
         writer.write("\nI Write From Program");
         writer.close();
         System.out.println("Suceesfully Wrote ");
        } 
        catch(IOException e)
        {
                System.err.println("An Error !!!");
                e.printStackTrace(); // Use to Show exception 
        }
        
    }
    
}
