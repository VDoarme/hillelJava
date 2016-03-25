/**
 * Created by Valiage on 19.02.2016.
 */
public class Home_02_05_Room_rental {

    public static void main(String[] args) {

        int days = 10;
        int price = 40;

        if (days > 3 && days < 7) {
            price = days * price - 20;
            System.out.println("Total price: " + price);
        }else if (days >= 7){
            price = days * price - 50;
            System.out.println("Total price: " + price);
        }else {
            price = price * days;
            System.out.println("Total price: " + price);
        }
    }
}
