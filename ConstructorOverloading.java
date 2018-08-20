package test;

public class ConstructorOverloading {
    
    public static void main(String[] args) {
        //The empty constructor is private, so we must use 
        //the only public constructor of the Person type
        //and we must provide the name and age values
        Person p1 = new Person("John", 35);
        System.out.println("Print p1 object");
        System.out.println(p1);

        //Create a new object of person type
        Person p2 = new Person("Rita", 22);
        System.out.println("\nPrint p2 object");
        System.out.println(p2);

        //Create a new object of employee type
        Employee e1 = new Employee("Charly", 29, 2500);
        System.out.println("\nPrint e1 object");
        System.out.println(e1);

    }
}
