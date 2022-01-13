package com.example.gof.creation.factory;

public class ConcreteNewF16Product implements F16Product {
    @Override
    public void fly() {
        System.out.println("New F16 is in air");
    }
}
