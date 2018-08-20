package test;

public class PassByReferenceTest {

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("John");
        printName(p);//Prints John
        modifyPerson(p);
        printName(p);//Prints Charly
    }

    public static void modifyPerson(Person arg) {
        arg.setFirstName("Charly");
    }

    public static void printName(Person p) {
        System.out.println("Received value: " + p.getFirstName());
    }
}
