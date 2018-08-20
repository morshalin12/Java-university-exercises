package test;

public class Person {

    private int idPerson;
    private String name;

    private static int peopleCounter;

    public Person(String name) {
        //Every time we create a Person object 
        //we increase the counter to obtain a new idPerson
        peopleCounter++;
        //we assign the new value to idPerson
        idPerson = peopleCounter;
        //We assign the received name
        this.name = name;
    }

    public String toString() {
        return "Person[idPerson: " + idPerson + ", name: " + name + "]";
    }

    public static int getPeopleCounter() {
        return peopleCounter;
    }
}
