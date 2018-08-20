package operations;

public class Arithmetic {

    //Class attributes
    int a;
    int b;

    //Empty Constructor
    //Remember that if we add a different constructor to the empty one 
    //this constructor is not created anymore and we must create it if we need it
    Arithmetic() {
    }

    //Constructor with 2 arguments
    Arithmetic(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }

    //This method takes new values, not the attributes of the class
    int add(int a, int b) {
        return a + b;
    }

    //This method takes the attributes of the class to make the addition. 
    //Adding more than one method with the same name is known as overloading 
    //of methods, we will study later this topic.
    int add() {
        return a + b;
    }
}
