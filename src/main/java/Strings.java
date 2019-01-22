/**
 * showing various Strings and how to properly compare them
 * if it's not clear, ALWAYS use compareTo when comparing strings
 */

public class Strings {
    public static void main(String[] args) {
        //strings are immutable

        // declaring a String using ""
        String example = "CSC260";
        // creating a new String object using the constructor
        String example2 = new String("CSC260-001");
        // new character array size 4 of characters t e s t
        char[] example3 = {'t', 'e', 's', 't'};
        // creating a new String object using the character array
        String example3Cont = new String(example3);
        System.out.println(example);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example3Cont);

        // comparing strings
        String example4 = "the same";
        String example5 = "the same";

        /*
         * should print They are the same
         * when example5 is created, it finds that
         * there is something in memory that is already
         * "the same" so it points to that memory address
         * so == technically works because addresses are
         * the same
         */
        if (example4 == example5)
            System.out.println("They are the same");
        else
            System.out.println("Not the same");

        // string declaration creating new objects and using non alphabet characters
        String example6 = new String("Last test for this?");
        String example7 = new String("Last test for this?");

        /*
         * should print Not the same2
         * two different String objects created, so
         * that have different memory addresses
         */
        if (example6 == example7)
            System.out.println("They are the same2");
        else
            System.out.println("Not the same2");

        /*
         * using compareTo to properly compare
         * will compare each character in the string
         * to the other to determine whether they are
         * equal
         * should print They are the same3
         */
        if (example6.compareTo(example7) == 0)
            System.out.println("They are the same3");
        else
            System.out.println("Not the same3");

        /*
         * shows that it is possible to get specific
         * characters of a string
         */
        for (int i = 0; i < example.length(); i++)
            System.out.println(example.charAt(i));

    }
}
