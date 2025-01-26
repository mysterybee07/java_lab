package Lab9;

import java.util.Scanner;
public class Division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0, denominator = 0;

        try {
            System.out.print("Enter the numerator: ");
            numerator = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the denominator: ");
            denominator = Integer.parseInt(scanner.nextLine());
            // Perform division and handle division by zero
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

