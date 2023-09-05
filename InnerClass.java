// import first.second;
// ===================== First class --------------------------------
class first{
    private String name = "First";
    public void displayname()
    {
        System.out.println("First class :\n Name : " + name);
    }
        // ------------------- Second Class --------------------
        class second{
            String name = "Second";
            public void displayname()
            {
                System.out.println("Second class :\n Name : " + name);
            }   
        }
        // ---------------- Third Class ---------------
        static class third{
            String name = "Third class";
            public void displayname()
            {
                System.out.println("Second class :\n Name : " + name);
            }   
        }// end of first class
}
public class InnerClass {
    public static void main(String[] args)
    {
        first f = new first();
        f.displayname();
        first.second s = f.new second();
        s.displayname();
        first.third t = new first.third(); // no need to create first class obj due to static keyword .
        t.displayname();
    }
}
