package day31_methodOverriding.employee_task;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
1. Create a class named Person with the following specifications:
     Attributes:
       - name: String
       - age: int

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - eat(): Displays the person's name with the message " is eating"
       - sleep(): Displays the person's name with the message " is sleeping"
       - toString(): Returns a string representation of the Person object.
 */