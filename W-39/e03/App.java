public class App {
    public static void main(String[] args) {
        int n = 6;
        int s = n - 1, k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.err.print(i);
            }
            s--;
            k++;
            System.out.println();
        }

    }
}