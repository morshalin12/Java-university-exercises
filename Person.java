package test;

public class Person { //Definition of the parent class

    private String name;
    private char gender;//M-Male, F-Female
    private int age;
    private String address;

    //Empty constructor
    public Person() {
    }

    //1 argument Constructor
    public Person(String name) {
        this.name = name;
    }

    //Full Constructor
    public Person(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + '}';
    }
}
