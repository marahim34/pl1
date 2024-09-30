public class App {
    public static void main(String[] args) {
        int n = 4;

        int s = n - 1, k = 1;

        for (int i = 1; i <= n; i++) {
            // Printing space
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            // Decrement of space
            s--;
            // Increment of stars
            k += 2;
            System.out.println();
        }
    }
}