/**
 * Created by User on 16.02.2016.
 */
public class ArraysExm2 {

    public static void main(String[] args) {

        int[]array = {3,5,9,1,8};


        //int i = 0;
        //int result = 0;
        /*
        while (i < 5) {
            result = result + array[i];
            i++;
        }
        */
        for (int i = 0; i < 5; i++){ // i+=2 == i = i + 2 ( i +=2) |
            System.out.println(array[i]);
            if (array[i] == 9){
                break;
            }
        }

        System.out.println("Continue cycle");
        for (int i =0; i < 5; i++) {
            if (array[i] == 9) {
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
