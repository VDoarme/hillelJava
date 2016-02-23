package intro;

/**
 * Created by User on 16.02.2016.
 */
public class ArraysExample3 {

    public static void main(String[] args) {

        int[]array = {3,5,9,6,8};

        int min = array[0];
        for (int element : array){
            if (element < min) {
                min = element;
            } // min = Math.min(element, min);
        }
        System.out.println(min);
    }
}
