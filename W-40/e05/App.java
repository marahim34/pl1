import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		StringBuilder newName = new StringBuilder();

		while (true) {
			System.out.println("Enter a name: ");

			String name = userInput.nextLine();

			if (name.equalsIgnoreCase("Quit")) {
				userInput.close();
				return;
			} else {
				newName.append(name);
				System.out.println(newName.toString());
			}
		}

	}
}
