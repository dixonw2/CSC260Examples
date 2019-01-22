/**
 * Messing around with threads
 * TestThreading class runs and prints every
 * 5 seconds regardless of what the main
 * method is doing
 */

import java.util.Scanner;

public class TestThreading implements Runnable {
    public void run() {
        long time = System.currentTimeMillis();
        int i = 1;
        while (true) {
            if (System.currentTimeMillis() == time + 5000) {
                System.out.println("It has been " + (5 * i++) + " seconds.");
                time += 5000;
            }
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        Thread test = new Thread(new TestThreading());

        // Daemon threads have lower priority so main method runs faster
        test.setDaemon(true);
        test.start();

        boolean stop = false;
        while (!stop) {
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            if (in.compareTo("tell me a story") == 0)
                System.out.println("what no I am a computer");
            if (in.compareTo("mean") == 0) {
                System.out.println(PlayingAround.mean(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
            }
            if (in.compareTo("stop") == 0)
                stop = true;
        }

        test.stop();

    }
}
