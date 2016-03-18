package collections;


import OOP.Cat;

import java.util.ArrayList;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));

        System.out.println(list);

        list.get(1);

        Object tom = list.get(1);

    }
}
