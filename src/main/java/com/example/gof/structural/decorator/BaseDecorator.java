package com.example.gof.structural.decorator;

public abstract class BaseDecorator implements IComponent{
    private IComponent component;
    public BaseDecorator(IComponent component){
        this.component = component;
    }
    public abstract void extra();
    @Override
    public void operation() {
        component.operation();
    }
}
