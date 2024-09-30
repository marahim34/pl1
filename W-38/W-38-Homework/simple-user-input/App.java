import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Type your age: ");

        int age = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Is this a weekend? (type yes/no) ");

        String weekendInput = userInput.nextLine();

        boolean isWeekend = false;

        if (weekendInput.equals("yes")) {
            isWeekend = true;
        }

        if (age < 18 || age > 65 && isWeekend) {
            System.out.println("Congrats! You are eligible");
        } else {
            System.out.println("Pay a regular ticked");
        }

    }
}