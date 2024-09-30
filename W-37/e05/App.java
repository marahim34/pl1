public class App {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = { -1, 0, 1, 9, 10 };

        // Printing header line
        System.out.println(
                "|---------|--------------|--------------|--------------------------------|--------------------------------|--------------------------------|");

        // Printing header
        System.out.printf("| %-7s | %-12s | %-12s | %-30s | %-30s | %-30s |\n",
                "Number", "number > 0", "number < 10", "number > 0 && number < 10",
                "!(number > 0 && number < 10)", "number > 0 || number < 10");

        // Printing header line
        System.out.println(
                "|---------|--------------|--------------|--------------------------------|--------------------------------|--------------------------------|");

        // For loop for getting the answers
        for (int i = 0; i < numbers.length; i++) {
            // Getting the current number from the numbers array
            int number = numbers[i];

            // Setting the logic of evaluation
            // boolean variables for each condition
            boolean greaterThanZero;
            if (number > 0) {
                greaterThanZero = true;
            } else {
                greaterThanZero = false;
            }

            boolean lessThanTen;
            if (number < 10) {
                lessThanTen = true;
            } else {
                lessThanTen = false;
            }

            boolean betweenZeroAndTen;
            if (number > 0 && number < 10) {
                betweenZeroAndTen = true;
            } else {
                betweenZeroAndTen = false;
            }

            boolean notBetweenZeroAndTen;
            if (!(number > 0 && number < 10)) {
                notBetweenZeroAndTen = true;
            } else {
                notBetweenZeroAndTen = false;
            }

            boolean orCondition;
            if (number > 0 || number < 10) {
                orCondition = true;
            } else {
                orCondition = false;
            }

            // Printing the answers
            System.out.printf("| %-7d | %-12s | %-12s | %-30s | %-30s | %-30s |\n",
                    number,
                    greaterThanZero ? "true" : "false",
                    lessThanTen ? "true" : "false",
                    betweenZeroAndTen ? "true" : "false",
                    notBetweenZeroAndTen ? "true" : "false",
                    orCondition ? "true" : "false");

            // Printing underline after the last line
            System.out.println(
                    "|---------|--------------|--------------|--------------------------------|--------------------------------|--------------------------------|");
        }
    }
}
