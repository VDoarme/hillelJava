package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinic {
    public static void main(String[] args) {

        Cat catTom = new Cat("Tom", "Blue", 2015);

        catTom.vacinate("SACC");

        //catTom.birthYear = 2014;
        System.out.println(catTom.getBirthYear());

        String name = catTom.getName();
        name.replace('T', 'K');
        System.out.println(name);



    }


}
