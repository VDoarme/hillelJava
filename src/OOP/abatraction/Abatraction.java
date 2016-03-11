package OOP.abatraction;

/**
 * Created by User on 11.03.2016.
 */
public class Abatraction {

    public static void main(String[] args) {
        Auto auto = new Lada(1995);
        System.out.println(auto);

        repair((Repairable)auto);
    }

    public static void repair(Repairable toRepair){
        toRepair.repair();
    }
}
