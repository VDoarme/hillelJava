package patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Beliver {

    static God god;
    String name;

    public Beliver(God theGod) {
    }


    @Override
    public String toString(){
        return "My name is " + name + " I belive in " + god.getName();
    }

    /**
     * Created by User on 03.06.2016.
     */
    public static class MyClass {
        static int i1;
        int i2;

        public MyClass(){
            i1++;
            i2++;
        }

        @Override
        public String toString(){
            return "i1 = " + i1 + ", i2 = " + i2;
        }
        public static void main(String[] args) {
            MyClass a = new MyClass();
            MyClass b = new MyClass();

            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
    }
}
