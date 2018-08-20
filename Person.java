package test;

public class Person {

    //Private attributes
    private int id;
    private String firstName;
    private boolean deleted;

    //Empty Constructor
    public Person() {
    }

    //Constructor with 3 arguments
    public Person(int id, String firstName, boolean deleted) {
        this.id = id;
        this.firstName = firstName;
        this.deleted = deleted;
    }

    //Public methods to get or set every attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", deleted=" + deleted + '}';
    }
    
}
