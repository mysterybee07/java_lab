package org.example.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Server implementation of the Factorial interface
public class FactorialImpl extends UnicastRemoteObject implements Factorial {

    protected FactorialImpl() throws RemoteException {
        super();
    }

    @Override
    public int calculateFactorial(int number) throws RemoteException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
