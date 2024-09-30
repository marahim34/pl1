import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number here: ");

        int number = scanner.nextInt();

        System.out.println("Input your text here: ");

        String anything = scanner.next();

        System.out.println("This number is " + number);
        System.out.println("Your name is " + anything);
    }
}