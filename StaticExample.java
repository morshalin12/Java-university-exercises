package test;

public class StaticExample {
    
    public static void main(String[] args) {
        Person p1 = new Person("John");
        System.out.println("Person1: " + p1);
        
        Person p2 = new Person("Rita");
        System.out.println("Person2: " + p2);
        
        //Print the people counter
        System.out.println("# People:" + Person.getPeopleCounter());
        
    }
}
