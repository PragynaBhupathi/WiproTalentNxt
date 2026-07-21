import java.util.*;

class hare extends Thread {
    public void run() {
        for (int i = 0; i <= 100 && !Race.finished; i++) {
            if (Race.finished) {
                break;
            }
            System.out.println("Hare is running: " + i + " miles");
            if (i == 60) {
                System.out.println("Hare is sleeping");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!Race.finished) {
            Race.finished = true;
            Race.winner = "Hare";
            System.out.println("Hare wins!");
        }
    }
}
class tortoise extends Thread {
    public void run() {
        for (int i = 0; i <= 100 && !Race.finished; i++) {
            if (Race.finished) {
                break;
            }
            System.out.println("Tortoise is running: " + i + " miles");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!Race.finished) {
            Race.finished = true;
            Race.winner = "Tortoise";
            System.out.println("Tortoise wins!");
        }
    }
}
public class Race {
    public static volatile boolean finished = false;
    public static volatile String winner = "";

    public static void main(String[] args) {
        hare h = new hare();
        tortoise t = new tortoise();

        h.setPriority(Thread.MAX_PRIORITY);
        

        h.start();
        t.start();
    }
}