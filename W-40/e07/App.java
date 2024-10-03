import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println(
				"Enter a password. The password must be at least 8 characters long and contain at least one uppercase letter (A-Z), one lowercase letter (a-z) and one digit (0-9).");

		while (true) {
			String password = userInput.nextLine();

			String result = validPassword(password);

			if (result.equals("valid")) {
				System.out.println("Password is valid");
				break;
			} else {
				System.out.println(result);
				System.out.println("Please try again");
			}
		}

		userInput.close();
	}

	public static String validPassword(String password) {
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasMinLength = password.length() >= 8;

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (isUpperCase(ch)) {
				hasUpperCase = true;
			} else if (isLowerCase(ch)) {
				hasLowerCase = true;
			} else if (isDigit(ch)) {
				hasDigit = true;
			}
		}

		StringBuilder feedback = new StringBuilder("Password is invalid.");

		if (!hasMinLength) {
			feedback.append(" It must be at least 8 characters long.");
		}
		if (!hasUpperCase) {
			feedback.append(" It must contain at least one uppercase letter (A-Z).");
		}

		if (!hasLowerCase) {
			feedback.append(" It must contain at least one lowercase letter (a-z).");
		}
		if (!hasDigit) {
			feedback.append(" It must contain at least one digit (0-9).");
		}

		if (hasMinLength && hasUpperCase && hasLowerCase && hasDigit) {
			return "valid"; // All criteria are met
		}

		return feedback.toString();
	}

	public static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	public static boolean isDigit(char ch) {
		return (ch >= '0' && ch <= '9');
	}

}