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
        if (args[0].compareTo("TA") == 0)
            System.out.println("Wyatt Dixon");
        if (args[1].compareTo("Professor") == 0)
            System.out.println("Dr. Cho");
        System.out.print("\nAll arguments input: ");
        for (int i = 0; i < args.length; i++)
            System.out.print(args[i] + ", ");
        /*
         * removes last space and comma
         * if using Eclipse to run this it will not look correct
         */
        System.out.println("\b\b");
    }
}
