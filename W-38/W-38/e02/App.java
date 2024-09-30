import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input your number here: ");

        int num = userInput.nextInt();

        if (num >= 0 && num <= 100) {
            if (num >= 90) {
                System.out.println("Excellent!");
            } else if (num >= 70 && num < 90) {
                System.out.println("Good Job!");
            } else if (num >= 50 && num < 70) {
                System.out.println("Needs Improvement!");
            } else {
                System.out.println("Fail!");
            }

        } else {
            System.out.println("Please input a valid number between 0 and 100");
        }

    }
}