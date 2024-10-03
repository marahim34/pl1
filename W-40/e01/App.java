import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please write down your name here: ");

		String name = userInput.nextLine();

		if (name.equalsIgnoreCase("Louis")) {
			System.out.println("Are you French?");
		} else {
			System.out.println("You have a great name!");
		}

		userInput.close();
	}
}