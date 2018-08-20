package people;

public class PersonTest {

    public static void main(String args[]) {
        //Creation of an object
        Person p1 = new Person();

        //Calling a method of the created object
        System.out.println("Default values of the Person object");
        p1.showPerson();

        //Modify values
        p1.id = 1;
        p1.firstName = "Rita";
        p1. lastName = "Brown";

        //We call the method again
        System.out.println("\nNew values for the Person object");
        p1.showPerson();
    }
}

