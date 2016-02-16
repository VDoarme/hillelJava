/**
 * Created by User on 16.02.2016.
 */
public class Task_1 {

    public static void main(String[] args) {


        String rating = "nice";
        int amount = 100;

        switch (rating){
            case "terrible":
                amount = amount + 0;
                break;
            case "good":
                amount = amount + 5;
                break;
            case "nice":
                amount = amount + 10;
                break;
            case "great":
                amount = amount + 20;
                break;
            default:
                System.out.println("Uknown rating");
        }
        System.out.println("Your total amount is: " + amount);
    }
}
