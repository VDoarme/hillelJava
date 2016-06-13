package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by User on 13.06.2016.
 */
public class MainStream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "Red", 9));
        apples.add(new Apple(250, "Green", 10));
        apples.add(new Apple(100, "Green", 11));
        apples.add(new Apple(250, "Yellow", 15));
        apples.add(new Apple(230, "Green", 15));

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 200;

        Function<Apple, String> toString = apple -> apple.getColor();

        Predicate<String> isYellow = letter -> letter.equals("Y");
        Predicate<String> notYellow = isYellow.negate();

        boolean areThereExpansiveApples = apples.stream()
                .anyMatch(apple -> apple.getPrice() > 10);

        Optional<Apple> expansiveApple = apples.stream()
                .filter(apple -> apple.getPrice() > 10)
                .findAny();




        expansiveApple.ifPresent(System.out::println);



        System.out.println(areThereExpansiveApples);


    }

    private static List<String> mapExample(List<Apple> apples) {
        return apples.stream()
        .map(Apple::getColor)
               .map(MainStream::extractFirstChar)
                .filter(letter -> !letter.equals("Y"))
                .collect(Collectors.toList());
    }

    public static String extractFirstChar(String string) {
        return string.substring(0, 1);
    }
    private static void limitExamples(List<Apple> apples) {
        List<Apple> greenApples = apples.stream()
                .filter(Apple::isGreen)
                .filter(MainStream::isHeavy)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(greenApples);
    }

    private static void foreach(List<Apple> apples) {
        apples.stream()
                .filter(Apple::isGreen) //ленивый потоk
                .filter(Apple::isHeavy)
                .forEach(System.out::println);
    }

    public static boolean isGreen(Apple apple){
        return apple.getColor().equals("Green");
    }

    public static boolean isHeavy(Apple apple){
        return apple.getWeight() > 200;

    }

}


/*

Экель. Хорстман. совершенный код. рефакториинг. паттерны. вебспринг. хибернейт
 */