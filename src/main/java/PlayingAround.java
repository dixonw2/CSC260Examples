import java.util.Random;

/**
 * just me playing around with some stuff but
 * I want it on git still
 */

public class PlayingAround {
    public static void main(String[] args) {
        System.out.printf("%8.4f\n", mean(4, 3, 6, 2, 1, 7, 7));
        System.out.printf("%8.4f\n\n", mean(100, 14, 499, 429, 23, 8, 0, 80, 188, 1, 1, 1, 288));

        int[] coinTosses = coinToss(250);
        System.out.print("Heads: ");
        for (int i = 0; i < coinTosses[0]; i++)
            System.out.print("|");

        // sketchy way of forcing proper spacing
        if (coinTosses[0] < coinTosses[1])
            for (int i = 0; i < coinTosses[1] - coinTosses[0]; i++)
                System.out.print(" ");

        System.out.printf("%10c%d%c\n", '(', coinTosses[0], ')');
        System.out.print("Tails: ");
        for (int i = 0; i < coinTosses[1]; i++)
            System.out.print("|");

        if (coinTosses[1] < coinTosses[0])
            for (int i = 0; i < coinTosses[0] - coinTosses[1]; i++)
                System.out.print(" ");

        System.out.printf("%10c%d%c", '(', coinTosses[1], ')');
    }

    // optional parameters
    public static double mean(Integer ... args) {
        int total = 0;
        for (int i = 0; i < args.length; i++)
            total += args[i];

        return (double) total / args.length;
    }

    public static int[] coinToss(int n) {
        int[] results = new int[2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            results[rand.nextInt(2)]++;
        }

        return results;
    }

}


