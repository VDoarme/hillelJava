package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectanleExampleClass {

    public static void main(String[] args) {
        Rectangle firstrRectangle = new Rectangle();
        firstrRectangle.setHeight(2);
        firstrRectangle.setWidth(3);
        firstrRectangle.setColor("Blue");

        int w = firstrRectangle.getWidth();
        int a = firstrRectangle.calculateArea();

        System.out.println(firstrRectangle.getHeight());
        System.out.println(firstrRectangle.getColor());

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.setHeight(5);
        secondRectangle.setWidth(10);

        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeight = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeight = 10;

        int area = calculateArea(firstRectangleHeight, secondRectangleWidth);
        area = calculateArea(firstrRectangle);
        System.out.println(area);

        //firstrRectangle.setHeight(4);
        System.out.println("Area after changing is: " + firstrRectangle.toString());

        Rectangle anotheRectangle = new Rectangle(firstrRectangle.getWidth(), firstrRectangle.getHeight());
        System.out.println(firstrRectangle.equals(anotheRectangle));

    }

    public static int calculateArea(int height, int width){
        return height * width;
    }

    public static int calculateArea(Rectangle rectangle){
        return rectangle.getHeight() * rectangle.getWidth();
    }
}
