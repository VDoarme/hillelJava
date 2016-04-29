package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread anotherThread = new Thread(new NumberPrinter());
        anotherThread.start();
        new NumberPrinter().run();
    }
}
