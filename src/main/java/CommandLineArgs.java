public class CommandLineArgs {
    public static void main(String[] args) {
        if (args[0].compareTo("no") == 0)
            System.out.println("is correct");
        else
            for (int i = 0; i < args.length; i++)
                System.out.println(args[i]);
    }
}
