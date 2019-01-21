public class TwoDimArrays {
    public static void main(String[] args) {
        int[][] stuff = new int[5][5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                stuff[i][j] = k++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", stuff[i][j]);
            }
            System.out.println();
        }

    }
}
