package operations;

public class ArithmeticTest {
    
     public static void main(String args[]){
        
        //We create an object of the Arithmetic class
        Arithmetic a = new Arithmetic();
        
        //We call the add method and receive the returned value
        int result = a.add(5, 3);
        
        System.out.println("Result:" + result);
    }   
}
