import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Palindrome test, please enter some text (or type 'quit' to exit):");

            String userText = userInput.nextLine();

            if (userText.equalsIgnoreCase("quit")) {
                System.out.println("You have ended the program.");
                break;
            }

            String testText = userText.replaceAll("[^a-zA-Z]", "").toLowerCase();

            int testTextLength = testText.length();

            char[] testTextCopy = testText.toCharArray();

            int i = 0, j = testTextLength - 1;

            while (i < j) {
                char tmp = testTextCopy[i];
                testTextCopy[i] = testTextCopy[j];
                testTextCopy[j] = tmp;
                i++;
                j--;
            }

            String reversedTestText = new String(testTextCopy);

            if (testText.equals(reversedTestText)) {
                System.out.println(userText + " is a palindrome.");
            } else {
                System.out.println(userText + " is not a palindrome.");
            }
        }

        userInput.close();
    }
}
