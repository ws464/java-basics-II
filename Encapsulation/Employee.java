package Encapsulation;

public class Employee extends Person{
    private int salary;
    public Employee(String firstName, String lastName, Byte age, Integer ssn, Integer salary){
        super(firstName, lastName, age, ssn);   
        this.salary=salary;
    }
    public String speak(){
        return String.format("Name: %s %s\nSalary: %d", this.getFirstName(), this.getLastName(), this.salary);
    }
}
