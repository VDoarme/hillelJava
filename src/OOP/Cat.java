package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Cat {
    private String color;
    private String name;
    private int birthYear;
    private String[] vacines = new String[10];;
    private int vacineCount;

    public Cat(String name, String color, int birthYear){
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void meow(){ System.out.println("meow!");}

    public void vacinate(String vacine){
        vacines[vacineCount] = vacine;
        vacineCount++;
        meow();
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getBirthYear(){
        return birthYear;
    }


}
