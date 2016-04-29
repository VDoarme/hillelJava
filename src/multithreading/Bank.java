package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class Bank {
    private long account1 = 10_000_000;
    private long account2 = 10_000_000;

    public synchronized void transfer(boolean direction, int amount){
        if (direction){
            account1 -= amount;
            account2 += amount;
        }else{
            account2 -= amount;
            account1 += amount;
        }
    }

    public void check(){
        String message = "";
        if(account1 + account2 != 20_000_000){
            System.out.println("Something wrong happened!");
        }
        System.out.println("Account_1 : " + account1);
        System.out.println("Account_2 : " + account2);
    }
}
