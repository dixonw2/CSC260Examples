public class TwoDimArraysObj {
    public static void main(String[] args) {
        Points[][] pointsArray = new Points[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pointsArray[i][j] = new Points(i, j);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
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
