package intro; /**
 * Created by User on 16.02.2016.
 */
import java.util.Scanner;

public class ScannerDelimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        int a = 0;

        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }

        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }

        System.out.println(a + b);
    }
}
