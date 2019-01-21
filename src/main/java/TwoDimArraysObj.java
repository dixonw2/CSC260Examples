/**
 * small 2D array example showing where each
 * point in the array is if accessed at
 * array[i][j] using an object Points
 */

public class TwoDimArraysObj {
    public static void main(String[] args) {
        Points[][] pointsArray = new Points[10][10];
        for (int i = 0; i < pointsArray.length; i++) {
            for (int j = 0; j < pointsArray[i].length; j++) {
                pointsArray[i][j] = new Points(i, j);
            }
        }

        for (int i = 0; i < pointsArray.length; i++) {
            for (int j = 0; j < pointsArray[i].length; j++) {
                System.out.print(pointsArray[i][j].toString() + " ");
            }
            System.out.println();
        }

    }
}

class Points {
    int x, y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }

}
