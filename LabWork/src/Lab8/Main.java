package Lab8;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Biraj Pudasaini", 500000);
        Manager mgr = new Manager("Aadarsh Tamang", 45000, "Dev");
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}
