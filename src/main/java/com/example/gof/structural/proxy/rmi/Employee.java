package com.example.gof.structural.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Employee extends UnicastRemoteObject implements IEmployee {
    public Employee() throws RemoteException {
    }

    @Override
    public void getInfo(String info) {
        System.out.println("INFO: " + info);
    }
}
