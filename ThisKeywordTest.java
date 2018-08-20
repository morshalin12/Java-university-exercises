package test;

public class ThisKeywordTest {
    public static void main(String[] args) {
        Person p = new Person("John");
    }    
}

class Person {
    String name; //attribute of the class

    Person(String name) {
        this.name = name; //this operator points to the current Person object
        System.out.println("Print current object inside Person class: " + this);
        //We print the person object
        Print i = new Print();
        i.print(this); //this is the current Person object
    }
}

class Print {

    public void print(Object o) {
        System.out.println("Print the argument inside Print class: " + o);//the parameter is a Person object
        System.out.println("Print the current object (this) inside Print Class: " + this); //this is the Print object (current object executing)
    }
}
