package collections;

/**
 * Created by User on 25.03.2016.
 */

import OOP.Cat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


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

        Object tom = list.get(3);

        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));

        System.out.println(linkedList.get(1));

        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;


    }

    public static void printForEach(Collection<Cat> collection){
        for(Cat cat: collection){
            System.out.println(cat);
        }
    }

    public  static void printList(List<Cat> cats){
        for (int i =0; i < cats.size(); i++){
            System.out.println(cats.get(i));
        }
    }
}

