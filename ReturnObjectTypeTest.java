package test;

public class ReturnObjectTypeTest {

    public static void main(String args[]) {
        Add add1 = createAddObject();
        int result = add1.add();
        System.out.println("Result:" + result);
    }

    public static Add createAddObject() {
        Add add = new Add(3, 4);
        return add;
    }
}//End of ReturnObjectTypeTest class

class Add {

    int a;
    int b;

    Add(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    
    public int add(){
        return a + b;
    }
}//End of Add class
