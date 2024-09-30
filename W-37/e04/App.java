public class App {
    public static void main(String[] args) {
        int num;
        double decimal;

        num = 10;
        decimal = 2.550000001;

        double sum = num + decimal;

        System.out.println("Sum = " + sum);

        int doubleSum = (int) sum;

        System.out.println("Double Sum = " + doubleSum);

    }
}