import java.util.Scanner;
public class conditionalStatement {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int x,y;
        System.out.println("Enter two numbers : ");
        x = obj.nextInt();
        y = obj.nextInt();
        String test = x == y ? ("Equal\n") : ("Not Equal\n"); // Short hand condition 
        System.out.println(test);
       
        System.out.println("x = "+ x + "\ty = " + y);
        if( x < y)

        {
            System.out.println("y is greater");
        }
        else if( x > y )
        {
            System.out.println("X is greater ");
        }
        else if( x == y)
        {
            System.out.println("x is equal to y ");
        }
        else
        {
            System.out.println("Worng input");
        }

    obj.close(); // we have to close this else if we use the array memory will leak .    
    int i = 0;
    while(i < 1)
    {
        System.out.println("\n\nEnter 1 to 3 number");
        int choice = obj.nextInt();
        switch(choice){
            case 1 :
                System.out.println("Good day");
                break;
            case 2 :
                System.out.println("Good Night");
                break;
            case 3 :
                System.out.println("Bye Bye !!!");
                break;
            default :
                System.out.println("Wotng INput");
                break;             
            }
            i++;
    }
    // i=0;
    // do
    // {
    //     for (int j = 0; j < 5; j++)
    //     {
    //         if ( i <= j)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.print("\n");
    //     }
    //     i++;   
    // }
    // while(i<5);
    
    //----------------------------
    
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String z : cars) {
      System.out.println(z);
    }
    
    for (i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
    }
    
    //--------------------------

        for(i=0; i<5; i++)   
        {   
        for(int j=0; j<=i; j++)   
        {   
        System.out.print("* ");   
        }   
        System.out.println(); }
    }

    

}
