import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Command to know user's age
        System.out.println("Enter your age here: ");

        int age = userInput.nextInt();

        // Command to know if the day is a weekend
        System.out.println("Is it a weekend? (Ans only yes/no)");

        String isWeekendString = userInput.next();

        // Initializing boolean variable
        Boolean isWeekend = null;

        if (isWeekendString.equalsIgnoreCase("yes")) {
            isWeekend = true;
        } else if (isWeekendString.equalsIgnoreCase("no")) {
            isWeekend = false;
        } else {
            System.out.println("Invalid input! Please answer only 'yes' or 'no'.");
            userInput.close();
            return;
        }

        if (age > 18 && age < 64) {
            System.out.println("You are not eligible for a discount based on your age!");
        } else {
            if (!isWeekend) {
                System.out.println("You are eligible for a discount! Enjoy your movie at a reduced price.");
            } else {
                System.out.println("No discounts are available on weekends, but enjoy the movie!!");
            }
        }

        userInput.close();

    }
}