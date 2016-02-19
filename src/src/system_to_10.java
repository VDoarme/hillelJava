/**
 * Created by User on 19.02.2016.
 */
public class system_to_10 {

    public static void main(String[] args) {

        int[] array = {0,1,0,0,0,1};
        int result = 0;

        for (int i = 0; i < array.length; i++){
           result = array[i] += Math.pow(array[i],2);
        }
        System.out.println(result);
    }
}

