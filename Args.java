public class Args {
    public static void main(String[] args) {
        System.out.println("Number of command-line arguments: " + args.length);

        // Print each command-line argument
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
 // THis code is showing how the (String[] args) statement works ? 
 // to observe this you have use following commands 
//  int cmd you have to write the 
// Step 1 = javac Args.java
// Step 2 = java Args args1 args2 ....
// See the result 
