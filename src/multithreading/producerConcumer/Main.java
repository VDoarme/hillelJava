package multithreading.producerConcumer;

/**
 * Created by User on 06.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Thread consumerThread = new Thread(new Consumer(bucket));
        Thread producerThread = new Thread(new Producer(bucket));


        consumerThread.start();
        producerThread.start();




        consumerThread.interrupt();
        producerThread.interrupt();

        try{
            consumerThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        try{
            producerThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("All threads are stapped");
        System.out.println(bucket);
    }
}
