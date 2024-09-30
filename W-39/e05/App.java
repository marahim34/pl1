import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Give a test score (-1 to quit)");

        int count = 0;
        int sum = 0;
        while (true) {
            int num = userInput.nextInt();

            if (num == -1) {
                break;
            }

            sum = sum + num;
            count++;

            float average = (float) sum / count;

            System.out.println("Average: " + average);
        }
    }
}