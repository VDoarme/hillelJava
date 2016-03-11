package OOP.inheritance.hierarchy;

/**
 * Наследование
 *
 */
public class Person extends Object{
    private String name;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hello I'm a person. My name is " + getName());
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Person)){
            return false;
        }
        Person other = (Person) o;
        return this.getName().equals(other.getName());
    }

    @Override
    public String toString(){
        return "I'm person My name is " + getName();
    }

}
