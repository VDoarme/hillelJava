package patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("mane time....");
        Thread.sleep(3000);
        TheGod.prophet();

        God theGod1 = new TheGod.getInstance();
        God theGod2 = new TheGod.getInstance();
        God theGod3 = new TheGod.getInstance();
    }

    public  static void commonReligiousQuestions(){



        Beliver ivan = new Beliver(theGod);
        ivan.name = "Ivan";

        Beliver petro = new Beliver(krishna);
        petro.name = "Petro";

        System.out.println(ivan);
        System.out.println(petro);

        Beliver.god = krishna;

        System.out.println(ivan);
        System.out.println(petro);
    }
}
