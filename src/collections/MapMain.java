package collections;

import OOP.inheritance.hierarchy.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 29.03.2016.
 */
public class MapMain {

    public static void main(String[] args) {

        Map<Person, Integer> personToDiscount = new HashMap<>();

        personToDiscount.put(new Person("Vasya"), 10);
        personToDiscount.put(new Person("Petya"), 10);
        personToDiscount.put(new Person("Vova"), 10);

        personToDiscount.put(new Person("Petya"), 20);

        Integer vasyaDiscount = personToDiscount.get(new Person("Vasya"));

        System.out.println(vasyaDiscount);

        for(Map.Entry<Person, Integer> personIntegerEntry : personToDiscount.entrySet()){
            System.out.println(personIntegerEntry.getKey() + "'s discount is " + personIntegerEntry.getValue());
        }
        /*
        for (Person person : personToDiscount.keySet(){

            personToDiscount.get(person);
        }
        */


    }
}
