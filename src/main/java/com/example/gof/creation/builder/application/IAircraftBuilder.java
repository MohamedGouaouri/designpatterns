package com.example.gof.creation.builder.application;

public interface IAircraftBuilder {
    // build steps
    IAircraftBuilder makeCockpit();
    IAircraftBuilder makeEngine();
    IAircraftBuilder makeWings();
}
