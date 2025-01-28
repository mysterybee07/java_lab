package org.example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FactorialServer {

    public static void main(String[] args) {
        try {
            // Create an instance of the Factorial implementation
            Factorial factorial = new FactorialImpl();

            // Start the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the service to the registry with the name "FactorialService"
            registry.rebind("FactorialService", factorial);

            System.out.println("Factorial Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
