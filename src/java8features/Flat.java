package java8features;

import java.util.Optional;

/**
 * Created by User on 10.06.2016.
 */
public class Flat {
    Optional<Citizen> citizen = Optional<Citizen>.empty();

    public Optional<Citizen> getCitizen() {
        return citizen;
    }


}
