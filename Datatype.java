import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
// import java.util.spi.LocaleNameProvider;

public class Datatype {
    public static void main(String[] args)
    {
        LocalDate v1 = LocalDate.now();
        LocalTime v2 = LocalTime.now();
        LocalDateTime v3 = LocalDateTime.now();
        DateTimeFormatter v4 = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        System.out.println("Local Date : " + v1 + "\n Local Time : "+ v2 + "\nLocal Before Date/Time : "+ v3 +"\nLocal Afer Date/Time : "+v4);
    } 
    
}
