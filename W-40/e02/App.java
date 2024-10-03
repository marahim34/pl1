import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a name: ");

		String name = userInput.nextLine();

		System.out.println("You entered: " + name);

		int nameLength = name.length();

		for (int i = 0; i < nameLength; i++) {
			System.out.println(name.charAt(i));
		}

		userInput.close();
	}
}