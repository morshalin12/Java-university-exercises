package test;

public class NullKeywordTest {

    public static void main(String[] args) {
        Person p1 = new Person("John");
        System.out.println("p1 name: " + p1.getName());
        
        Person p2 = p1; //p2 points to the same object as p1
        System.out.println("p2 name: " + p2.getName());
        
        //We make p1 no longer point to the object p1
        p1 = null;
        
        //Check that p2 is still accessing the object
        System.out.println("p2 name: " + p2.getName());
    }    
}

class Person{
    String name; //default value is null
    
    public Person(String nameArg){
        name = nameArg;
    }
    
    public String getName(){
        return name; 
    }
}

