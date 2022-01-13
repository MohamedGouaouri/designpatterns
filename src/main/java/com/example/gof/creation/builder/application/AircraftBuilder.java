package com.example.gof.creation.builder.application;

public class AircraftBuilder implements IAircraftBuilder {

    Aircraft aircraft;

    @Override
    public AircraftBuilder makeCockpit() {
        Cockpit cockpit = new Cockpit();
        // customize cockpit
        aircraft.setCockpit(cockpit);
        return this;
    }

    @Override
    public AircraftBuilder makeEngine() {
        Engine engine = new Engine();
        // customize engine
        aircraft.setEngine(engine);
        return this;
    }

    @Override
    public AircraftBuilder makeWings() {
        Wing[] wings = new Wing[]{new Wing(), new Wing()};
        aircraft.setWings(wings);
        return this;
    }


    public Aircraft getResult(){
        return aircraft;
    }
}
