/**
 * example of creating (example) and declaring (example2) a 2D array
 * example 2 also shows a row in the 2D array being a different length
 * shows how to iterate through each row properly using loops
 */

public class TwoDimArrays {
    public static void main(String[] args) {
        int[][] example = new int[5][5];
        int[][] example2 = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11}
        };

        // creates array
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                example[i][j] = k++;
            }
        }

        /*
         * iterates through the array
         * outer loop is #rows, so in example2's case
         * it is 3
         * inner loop is #elements in row[i], so first 2
         * rows have 5 elements and 3rd has 2
         */
        for (int i = 0; i < example2.length; i++) {
            for (int j = 0; j < example2[i].length; j++) {
                System.out.printf("%2d ", example2[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example[i].length; j++) {
                System.out.printf("%2d ", example[i][j]);
            }
            System.out.println();
        }

    }
}
