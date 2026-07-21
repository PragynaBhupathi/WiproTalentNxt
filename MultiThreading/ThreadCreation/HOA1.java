import java.util.*;

class scooby extends Thread {
    public void run() {
        System.out.println("Thread1 name: " + Thread.currentThread().getName());
    }
}

class shaggy extends Thread {
    public void run() {
        System.out.println("Thread2 name: " + Thread.currentThread().getName());
    }
}

public class HOA1 {
    public static void main(String[] args) {
        scooby t1 = new scooby();
        shaggy t2 = new shaggy();

        t1.setName("scooby");
        t2.setName("shaggy");

        t1.start();
        t2.start();
    }
}