package com.example.gof.structural.decorator;

public class ConcreteComponent implements IComponent {
    @Override
    public void operation() {
        System.out.println("Normal print");
    }
}
