/**
 * Created by User on 09.02.2016.
 */
public class MyFirstClass {
    public static void main(String args[]){
        String message = "Hello World!";
        int birthYear = 1984;
        int age = 2016 - birthYear;

        message = "Hello, " + "World! I'm " + age;

        System.out.println(message);

        long millisecondsFromBC = 2016L * 365 * 24 * 3600 * 1000;
        long millisecondsFromBC = (long) 2016 * 365 * 24 * 3600 * 1000;

        /**int intYears = (int) years;*/

        System.out.println(millisecondsFromBC);
    }
}
