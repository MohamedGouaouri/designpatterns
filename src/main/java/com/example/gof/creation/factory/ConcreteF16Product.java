package com.example.gof.creation.factory;

public class ConcreteF16Product implements F16Product{
    @Override
    public void fly() {
        System.out.println("F16 is in air");
    }
}
