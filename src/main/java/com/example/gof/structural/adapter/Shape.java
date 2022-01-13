package com.example.gof.structural.adapter;

public abstract class Shape {
    public void setLocation(){}
    public void getLocation(){}
    abstract public void display();
    abstract public void fill();
    abstract public void setColor();
    public void remove(){};
}
