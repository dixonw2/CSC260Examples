/**
 * short example of using arguments through command line
 * in Intellij, can create a run config with specific
 * args
 * */

/**
 * in terminal/command prompt, can compile using javac
 * then use command "java CommandLineArgs words" where
 * words is simply one or more words that can be used in
 * your program
 */

public class CommandLineArgs {
    public static void main(String[] args) {
        if (args[0].compareTo("no") == 0)
            System.out.println("is correct");
        else
            for (int i = 0; i < args.length; i++)
                System.out.println(args[i]);
    }
}
