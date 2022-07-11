import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print(">");
        String name = scanner.next();
        System.out.println("Hello," + name);
        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            Random rnd = new Random();
            int ch = rnd.nextInt(10) % 2;
            int t = i+1;
            if (ch == 0) {
                System.out.println("Round " + t + ": Heads");
                head++;
            } else {
                System.out.println("Round " + t + ": Tails");
                tail++;
            }
        }
        System.out.println("Heads: " + head + ", Tails: " + tail);
        if (head > tail) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name  + " lost!");
        }
    }
}