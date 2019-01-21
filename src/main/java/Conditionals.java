public class Conditionals {
    public static void main(String[] args) {
        int w = 10, x = 15, y = 20, z = -50;

        //true
        if (w > 5)
            System.out.println("w > 5 - True");
        else
            System.out.println("w > 5 - False");

        //false
        if (w > 10)
            System.out.println("w > 10 - True");
        else
            System.out.println("w > 10 - False");

        //both false, doesn't print anything
        if (y > 20)
            System.out.println("y > 20 - True");
        else if (y < 20)
            System.out.println("y < 20 - True");

        //w > z
        if (w > x)
            System.out.println("w > x - True");
        else if (w > y)
            System.out.println("w > y - True");
        else if (w > z)
            System.out.println("w > z - True");
        else
            System.out.println("w > anything - False");

        //case 20, then no break statement so cascades to next
        switch(y) {
            case 10:
                System.out.println("case 10");
                break;
            case 15:
                System.out.println("case 15");
                break;
            case 20:
                System.out.println("case 20");
            case 21:
                System.out.println("case 21 through cascading");
                break;
            default:
                System.out.println("default");
        }

    }
}
