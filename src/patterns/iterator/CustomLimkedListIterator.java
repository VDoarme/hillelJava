package patterns.iterator;

import collections.ListElement;

import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class CustomLimkedListIterator implements Iterator{


    private ListElement next;

    public CustomLimkedListIterator(ListElement next) {
        this.next = next;
    }



    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Object next() {
        Object value = next.getValue();
        next = next.getNext();

        return value;
    }
}
