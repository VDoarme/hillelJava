package OOP;

/**
 * Created by User on 11.03.2016.
 */
public class Sorter {
    public void sort(int[] unsorted){
        boolean swap = false;
        do  {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++]) {
                if (unsorted[i].compareTo(unsorted[i + 1]) > 0){
                    int temp = unsorted[i];
                    unsorted[i]=unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true
                }
            }
        } while (swap);


    }

    public static void main(String[] args) {
        int[] a =
    }

}
