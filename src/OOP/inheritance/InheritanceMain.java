package OOP.inheritance;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Manager;
import OOP.inheritance.hierarchy.Person;

/**
 * Created by User on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");

        manager.fire(employee);

        person.getName();

        Person emplpoyeeAsPerson = employee;//абкаст
        emplpoyeeAsPerson = person;

        Person managerAsPerson = manager;

        managerAsPerson.getName();
        emplpoyeeAsPerson.getName();

        //Manager personAsManager = person;

        //Employee employee1 = (Employee) emplpoyeeAsPerson; //Так лучше не делать, приводит к ошибкам //даункаст

        if (emplpoyeeAsPerson instanceof Employee){
            System.out.println("he is employee");
        }else {
            System.out.println("he is not employee");
        }


        //System.out.println(person.greeting(););

        person.greeting();
        employee.greeting();
        manager.greeting();



    Person somebody = employee;
    somebody.greeting();



        speak(person);
        speak(emplpoyeeAsPerson);
        speak(manager);

        System.out.println(person.getName());
        System.out.println(manager.getName());

    }

    public static void speak(Person person){
        person.greeting();
    }

}
