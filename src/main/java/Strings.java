/**
 * showing various Strings and how to properly compare them
 * if it's not clear, ALWAYS use compareTo when comparing strings
 */

public class Strings {
    public static void main(String[] args) {
        //strings are immutable
        String example = "CSC260";
        String example2 = new String("CSC260-001");
        char[] example3 = {'t', 'e', 's', 't'};
        String example3Cont = new String(example3);
        System.out.println(example);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example3Cont);

        // comparing strings
        String example4 = "the same";
        String example5 = "the same";

        if (example4 == example5)
            System.out.println("They are the same");
        else
            System.out.println("Hahaha try again");

        String example6 = new String("I'm falling");
        String example7 = new String("I'm falling");

        if (example6 == example7)
            System.out.println("They are the same2");
        else
            System.out.println("Hahaha try again2");

        //using compareTo to properly compare
        if (example6.compareTo(example7) == 0)
            System.out.println("We're the same okay please stop comparing us");
        else
            System.out.println("This should never happen");

        for (int i = 0; i < example.length(); i++)
            System.out.println(example.charAt(i));

    }
}
