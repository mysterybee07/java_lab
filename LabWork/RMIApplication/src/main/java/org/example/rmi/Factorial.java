package org.example.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Define an RMI interface
public interface Factorial extends Remote {
    int calculateFactorial(int number) throws RemoteException;
}
