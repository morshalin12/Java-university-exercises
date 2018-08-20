package operations;

public class ArithmeticTest {

    public static void main(String args[]) {
        //Local Variables
        int operandA = 6;
        int operandB = 2;

        //We create an object of the Arithmetic class sending arguments
        Arithmetic obj1 = new Arithmetic(operandA, operandB);

        //Print operands
        System.out.println("Operand A:" + operandA + " and operand B:" + operandB);

        //Result of the addition
        System.out.println("\nAddition result:" + obj1.addition());

        //Result of subtraction
        System.out.println("\nSubstraction result:" + obj1.substraction());

        //Result of multiplication
        System.out.println("\nMultiplication result:" + obj1.multiplication());

        //Result of division
        System.out.println("\nDivision result:" + obj1.division());
    }

//    void anotherMethod(){
//        //Cannot access a local variable declared in another method
//        System.out.println("Operand A" + operandA);
//    }
}
