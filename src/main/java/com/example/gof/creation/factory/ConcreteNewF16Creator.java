package com.example.gof.creation.factory;

public class ConcreteNewF16Creator implements IF16Creator {
    @Override
    public ConcreteNewF16Product makeF16() {
        return new ConcreteNewF16Product();
    }
}
