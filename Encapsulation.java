package test;

public class Encapsulation {

    public static void main(String[] args) {
        //Create an object
        Person p1 = new Person(1, "John", false);
        //Access the attribute 
        System.out.println("p1 name: " + p1.getFirstName());

        //Create and object
        Person p2 = new Person(2, "Rita", false);
        //The method toString is called automatically by the println method
        //to print the State of the object
        System.out.println("State of the object p2:" + p2);

        //Set the person 2 as deleted
        p2.setDeleted(true);
        //We print the state of the object p2
        System.out.println("State of the object p2:" + p2);

        //Create an object with the default values
        Person p3 = new Person();
        //We print the state of the object p3
        System.out.println("State of the object p3:" + p3);
    }
}
