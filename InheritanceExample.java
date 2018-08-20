package test;

public class InheritanceExample {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 2500);
        System.out.println("Print Employee1");
        System.out.println(e1);
        
        Employee e2 = new Employee("Charly", 3800);
        e2.setAge(28);
        e2.setGender('M');
        e2.setAddress("Colombia");
        System.out.println("\nPrint Employee2");
        System.out.println(e2);
        
        //When we create a new object of java.util.Date we return the current date
        Client c1 = new Client(new java.util.Date(), false);
        System.out.println("\nPrint object Client1");
        System.out.println(c1);
        //We complete the person object associated with this client object
        c1.setName("Rita");
        c1.setAge(22);
        c1.setGender('F');
        c1.setAddress("Mexico");
        System.out.println("\nPrint client1 again");
        System.out.println(c1);
    }
}

