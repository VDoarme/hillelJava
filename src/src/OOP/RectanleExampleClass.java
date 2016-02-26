package src.OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectanleExampleClass {

    public static void main(String[] args) {
        Rectangle firstrRectangle = new Rectangle();
        firstrRectangle.height = 2;
        firstrRectangle.width = 3;
        firstrRectangle.color = "Blue";

        int w = firstrRectangle.width;
        int a = firstrRectangle.calculateArea();

        System.out.println(firstrRectangle.height);
        System.out.println(firstrRectangle.color);

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.height = 5;
        secondRectangle.width = 10;

        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeight = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeight = 10;

        int area = calculateArea(firstRectangleHeight, secondRectangleWidth);
        area = calculateArea(firstrRectangle);
        System.out.println(area);

    }

    public static int calculateArea(int height, int width){
        return height * width;
    }

    public static int calculateArea(Rectangle rectangle){
        return rectangle.height * rectangle.width;
    }
}
