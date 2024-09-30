import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number (0 to quit the program): ");

            int n = userInput.nextInt();

            if (n > 0 && n % 2 != 0) {
                System.out.println("Odd number");
            } else if (n > 0 && n % 2 == 0) {
                System.out.println("Even number");
            } else if (n == 0) {
                break;

            }
        }

    }
}