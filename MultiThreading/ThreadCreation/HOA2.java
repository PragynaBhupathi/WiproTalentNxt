import java.util.Random;

class ColorPrinter implements Runnable {
    private final String[] colors = {"white","blue","black","green","red","yellow"};

    public void run() {
        Random random = new Random();

        while (true) {
            String color = colors[random.nextInt(colors.length)];
            System.out.println(color);

            if (color.equals("red")) {
                break;
            }
        }
    }
}

public class HOA2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ColorPrinter());
        t.start();
    }
}
