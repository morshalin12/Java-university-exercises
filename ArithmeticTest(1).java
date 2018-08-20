package operations;

public class ArithmeticTest {
    
     public static void main(String args[]){
        
       //We create an object of the Arithmetic class with the empty constructor
        Arithmetic obj1 = new Arithmetic();
        
        //We call the add method and receive the returned value
        int resultado = obj1.add(5, 4);
        
        System.out.println("Direct use of adding without using attributes of the class. obj1:" + resultado);
        
        //If we call directly the method adding without arguments the value is zero, 
        //since the attributes of the object were never initialized 
        //since the constructor with arguments was not used, but the empty constructor
        System.out.println("\nResult of adding using attributes obj1:" + obj1.add() );
        
        //Now we create an object with the constructor with 2 arguments
        Arithmetic obj2 = new Arithmetic(2,1);
        
        //We print the result directly. 
        //By directly calling the sum method, we return the value of the sum
        System.out.println("\nResult of adding using attributes obj2:" + obj2.add() );

    }   
}
