import java.util.*;

class EvenThread extends Thread {
    public void run() {
        System.out.println("EvenThread displaying even numbers from 1 to 20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("OddThread displaying odd numbers from 1 to 20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class HOA2 {
    public static void main(String args[]) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}