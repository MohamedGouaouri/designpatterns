package com.example.gof.creation.factory;

public class ConcreteF16Creator implements IF16Creator{
    @Override
    public F16Product makeF16() {
        return new ConcreteF16Product();
    }
}
