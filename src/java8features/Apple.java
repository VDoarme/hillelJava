package java8features;

/**
 * Created by User on 06.06.2016.
 */
public class Apple {
    private int weight;
    private String color;
    private int price;

    public Apple(){

    }

    public Apple(int weight, String color, int price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        System.out.println("Get color called");
        return color;
    }

    public int getPrice() {
        System.out.println("Is called get price");
        return price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean isGreen(){
        System.out.println("Is green called");
        return color.equals("Green");
                    }
    public boolean isHeavy(){
        return weight > 200;
    }
}