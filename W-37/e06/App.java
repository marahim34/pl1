public class App {

    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        boolean andResult = isJavaFun && isFishTasty;
        boolean orResult = isJavaFun || isFishTasty;
        boolean notResult = !(isJavaFun) && !(isFishTasty);

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
}