/**
 * Created by User on 16.02.2016.
 */
public class Task_2 {

    public static void main(String[] args) {


        int fact = 1;
        int i = 5;

        while (i > 0){
            fact = fact * i;
            i--;
        }
        System.out.println("Result is " + fact);
    }
}
