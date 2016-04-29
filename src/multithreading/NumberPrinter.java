package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class NumberPrinter implements Runnable{
    public void run(){
        Thread currentThread = Thread.currentThread();
        for(int i = 0; i <= 10; i++){
            String name = currentThread.getName();
            System.out.println(name + " " + i);
        }
    }
}
