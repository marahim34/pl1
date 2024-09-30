import java.util.Scanner;

public class App {

    enum daysOfWeek {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the day today, e.g. Monday, Tuesday ...? (Write here): ");

        String day = userInput.nextLine();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Today is " + daysOfWeek.Monday + ". Start of the work week!");
                break;
            case "tuesday":
                System.out.println("Today is " + daysOfWeek.Tuesday + ". Keep up the good work!");
                break;
            case "wednesday":
                System.out.println("Keep calm. It is already " + daysOfWeek.Wednesday + ".");
                break;
            case "thursday":
                System.out.println("Happy " + daysOfWeek.Thursday + ".");
                break;
            case "friday":
                System.out.println("Today is " + daysOfWeek.Friday + ". Have a great weekend ahead!");
                break;
            case "saturday":
                System.out.println("Today is " + daysOfWeek.Saturday + ". Enjoy the weekend!");
                break;
            case "sunday":
                System.out.println("Today is " + daysOfWeek.Sunday + ". Enjoy the weekend!");
                break;
            default:
                System.out.println("Invalid input! Please enter a valid day of the week.");
                break;
        }

    }
}