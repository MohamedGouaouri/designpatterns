package com.example.gof.structural.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployee extends Remote {
    void getInfo(String info) throws RemoteException;
}
