public class App {
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int modulo = a % b;

        System.out.printf("Sum = %d\nDifference = %d\nProduct = %d\nQuotient = %d\nModulo = %d\n", sum, difference,
                product, quotient, modulo);
    }
}