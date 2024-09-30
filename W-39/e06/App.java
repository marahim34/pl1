import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInteger = random.nextInt(11);

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number: ");
            int number = userInput.nextInt();

            if (number > 0 && number <= 10) {

                if (number == randomInteger) {
                    System.out.println("SUCCESS!");
                    break;
                } else if (number > randomInteger) {
                    System.out.println("Guess was too high");
                } else {
                    System.out.println("Guess was too low");
                }

            } else {
                System.out.println("Please input a number between 1 and 10");
            }
        }
    }
}
