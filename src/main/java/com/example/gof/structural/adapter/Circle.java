package com.example.gof.structural.adapter;

public class Circle extends Shape{
    private XXCircle xxCircle;
    @Override
    public void display() {
        xxCircle.xDisplay();
    }

    @Override
    public void fill() {
        xxCircle.xFill();
    }

    @Override
    public void setColor() {
        xxCircle.xSetColor();
    }
}
