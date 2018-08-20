package test;

public class Employee extends Person {

    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    public Employee(String name, double salary) {
        super(name); //super must be the first line of the constructor
        this.idEmployee = ++employeeCounter;//first increase then assign
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //first we print the parent attributes of the parent class
        //after that we print the child attributes of the child class
        return super.toString() + " Empleado{" + "idEmpleado=" + idEmployee + ", sueldo=" + salary + '}';
    }
}
