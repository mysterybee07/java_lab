package Lab8;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display details (to be overridden)
    public void displayDetails() {
        System.out.println("Lab8.Employee Name: " + name);
        System.out.println("Lab8.Employee Salary: " + salary);
    }
}


