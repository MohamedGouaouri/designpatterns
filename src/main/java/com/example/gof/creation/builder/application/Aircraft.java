package com.example.gof.creation.builder.application;

class Cockpit{

}
class Engine{
    public String name;
}
class Wing{

}

public class Aircraft {
    private Cockpit cockpit;
    private Engine engine;
    private Wing[] wings;






    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wing[] getWings() {
        return wings;
    }

    public void setWings(Wing[] wings) {
        this.wings = wings;
    }
}
