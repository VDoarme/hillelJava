package OOP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 11.03.2016.
 */
public class Sorter {

    public void sort(Object[] unsorted, Comparator comparator){
        boolean swap = false;
        do  {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {

                if (comparator.compare(unsorted[i], unsorted[i + 1]) > 0){
                    Object temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);


    }

    public static void main(String[] args) {
        int[] a = {9, 5, 8, 4, 3, 7};
        String[] s = {"a","b","e","c"};
        new Sorter().sort(s);
        System.out.println(Arrays.toString(s));


    }

}
