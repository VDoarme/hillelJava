package intro;

import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerExample {

           public static void main(String[] args) {

            int a;
            int b;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input First Number: ");
            a = scanner.nextInt();
            System.out.print("Input Second number: ");
               b = scanner.nextInt();

               System.out.println();

               int sum = a + b;
               System.out.println("The sum is ");


        }
    }

