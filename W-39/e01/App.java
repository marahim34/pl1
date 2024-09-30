import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Input the number for which you want to create a multiplication table: ");

        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        for (int i = 0; i <= 10; i++) {
            int multiplication = i * number;

            System.out.printf("%d x %d = %d\n", i, number, multiplication);

        }
    }
}