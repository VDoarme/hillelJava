package intro;

/**
 * Created by User on 23.02.2016.
 */
public class logicalOperation {

    public static void main(String[] args) {
        boolean result = a() || b(); // При || второй метод не будет рассмотреть т.к. достаточно первого длярезультата
        System.out.println(result);  // При | второй метод Будет рассмотреть т.к. НЕдостаточно первого длярезультата

    }
    public static boolean a(){
        System.out.println("Method a is called");
        return false;
    }

    public static boolean b(){
        System.out.println("Methos b is called");
        return true;
    }
}
