package org.example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FactorialClient {

    public static void main(String[] args) {
        try {
            // Locate the RMI registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the FactorialService
            Factorial factorial = (Factorial) registry.lookup("FactorialService");

            // Input number for factorial calculation
            int number = 10; // Example number
            System.out.println("Factorial of " + number);

            // Call the remote method
            int result = factorial.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
