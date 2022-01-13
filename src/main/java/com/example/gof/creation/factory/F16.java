package com.example.gof.creation.factory;
class F16Engine{

}


class F16Cockpit{

}

public class F16 {
    F16Engine engine;
    F16Cockpit cockpit;

    protected void makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
    }

    public void fly() {
        makeF16();
        System.out.println("F16 with bad design flying");
    }
}