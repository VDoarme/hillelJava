package OOP.abatraction;

/**
 * Created by Valiage on 19.04.2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        Auto auto = new Lada(1995);
        System.out.println(auto);

        repair((Repairable) auto);


    }

    public static void repair(Repairable toRepair) {
        toRepair.repair();
    }
}