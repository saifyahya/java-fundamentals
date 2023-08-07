import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(pluralize(("cat"), 0));
        flipNHeads(1);
        clock();
    }

    public static String pluralize(String s, int number) {
        if (number == 0 || number > 1)
            return s + "s";
        return s;
    }

    public static void flipNHeads(int n) {
        int headsCount = 0;
        int totalCounts = 0;
        while (headsCount != n) {
            double x = Math.random();
            totalCounts++;
            if (x >= 0.5) {
                System.out.println("head");
                headsCount++;
            } else {
                System.out.println("tail");
                headsCount = 0;
            }
        }
        System.out.println("it took " + totalCounts + " flips to flip " + headsCount + " heads in a row");
    }

    public static void clock() {
        try {
            while (true) {
                LocalDateTime currentTime = LocalDateTime.now();
                String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(formattedTime);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
