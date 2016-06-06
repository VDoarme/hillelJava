package patterns.singleton;

/**
 * Created by User on 06.06.2016.
 */
public class GodExtractor implements Runnable{
    TheGodSingleton god;
    @Override
    public void run() {
        god = TheGodSingleton.getInstance();
    }
}
