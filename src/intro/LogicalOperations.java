package intro;

/**
 * Created by Valiage on 19.04.2016.
 */
public class LogicalOperations {
    public static void main(String[] args) {
        boolean result = a() && b();
        System.out.println(result);
    }

    public static boolean a() {
        System.out.println("method a is called");
        return true;
    }

    public static boolean b() {
        System.out.println("method b is called");
        return true;
    }

}