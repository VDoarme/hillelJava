package collections;

import java.util.Comparator;

/**
 * Created by User on 18.03.2016.
 */
public class ReversComparator implements Comparable{

    private Comparator comparator;
    public ReversComparator(Comparator comparator){
        this.comparator = comparator;
    }

    @Override
    public int compare(Object o1, Object o2){
        return comparator.compare(o1, o2) * -1;
    }
}
