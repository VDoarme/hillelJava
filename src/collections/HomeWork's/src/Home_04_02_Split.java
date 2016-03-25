import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Valiage on 23.02.2016.

 i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
 Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.

 Пример ввода:
 internationalization localization cat elephant monitor
 Результат:
 i18n l10n cat e6t m5r

 PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который поместит слова в массив и для каждого из них вызовет вашу функцию

 */
public class Home_04_02_Split {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Text to reduction");
        String text = scanner.nextLine();
        String[] textArray = text.split(" ");

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(WordsReduction(textArray[i]));
            if (i < (textArray.length - 1)) {
                System.out.print(" ");
            }
        }
    }

    private static String WordsReduction(String word) {
        int wordLength = word.length();
        if (wordLength > 3) {
            word = word.substring(0, 1) + (wordLength - 2) + word.substring(wordLength - 1, wordLength);
        }
        return word;
    }
}
