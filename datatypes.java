public class datatypes {
    public static void main(String[] args){
        System.out.println("Data Types");
        int num1 = 100;
        double num2 = 200.12345;
        char num3 = 'A';
        boolean num4 = false;
        String num5 = "This is a String";
        // char[10] num6 = "array";
        System.out.println("num1 = " + num1 + "\n num2 = " + num2  + "\n num3 = " + num3 + "\n num4 = " + num4 + "\n num5 = " + num5 );
        System.out.println("size of num5 : " + num5.length());
        System.out.println("Upper char of num5 : " + num5.toUpperCase());
        System.out.println("Lower Case num5 : " + num5.toLowerCase());
        System.out.println("Find the charater in String(num5) : " + num5.indexOf("String"));

        String fname = "Zain";
        String lname = "Mirza";
        System.out.println("Combine the string : " + fname +" "+ lname);
                System.out.println("Concatenate the string : " + fname.concat(lname));
        String res = num1 + num5;
        System.out.println("num1 + num5 : " + res );

        String quote = " In String We use different Qoutes \" -> \' Like This \'<- \" . ";
         System.out.println("Quote String : " + quote);

         System.out.println("Maths Lib Function : \n num1 = 5 , num2 = 10");
         System.out.println("Max : " + Math.max(5,10) );
         System.out.println("Min : " + Math.min(5,10) );
         System.out.println("Square root of 16 : " + Math.sqrt(16) );
        
         int ran = (int)(Math.random()*101);
         System.out.println("Random number b/w 0 to 100 : " + ran);

            


    }

}
