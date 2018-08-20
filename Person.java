package test;

public class Person {
    
    private int personId;
    private String name;
    private int age;
    private static int peopleCounter;

    //Constructor with no arguments and private
    //Assigns the personId value
    private Person() {
        this.personId = ++peopleCounter;
    }

    //Full constructor overloaded
    public Person(String name, int age) {
        //The empty constructor is called
        this();//must be the first line in the constructor if used
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + " personId=" + personId + ", name=" + name + ", age=" + age + '}';
    }
}
