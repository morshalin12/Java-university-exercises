package test;

public class Employee extends Person {
    
    private double salary;

    public Employee(String nombre, int edad, double sueldo) {
        super(nombre, edad); //Super must be the first line if used
        this.salary = sueldo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
     @Override
    public String toString() {
        //First we call the toString method of the parent class
        //after that we concatenate the attributes of the child class
        return super.toString() + " Employee{salary=" + salary + "}";
    }
}
