public class App {
    public static void main(String[] args) {
        int score = 80;
        System.out.println("This is the score " + score);

        if (score < 50) {
            System.out.println("Fail!");
        } else if (score >= 80) {
            System.out.println("Good Work!");
        } else {
            System.out.println("Pass!");
        }
    }
}