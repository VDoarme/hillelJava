package OOP.inheritance.hierarchy;

/**
 * Наследование
 *
 */
public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hello I'm a person. My name is " + getName());
    }

    public boolean equals(Person other){
        return this.getName().equals(other.getName());
    }
}
