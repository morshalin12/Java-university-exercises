package people;

public class Person {

    //Class attributes
    //It is not necessary to assign values
    //The compiler assigns default values
    int id;
    String firstName;
    String lastName;

    //Class methods
    //The objects of this class will use this method
    public void showPerson() {
        System.out.println("id : " + id);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
    }
}
