package com.example.gof.structural.decorator;

public class Decorator extends BaseDecorator{

    public Decorator(IComponent component){
        super(component);
    }
    @Override
    public void extra() {
        System.out.println("Extra work added");
    }

    @Override
    public void operation() {
        extra();
        super.operation();
    }
}
