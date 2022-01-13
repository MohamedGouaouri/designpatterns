package com.example.td4.exo3;

public class Closed implements DoorState{


    @Override
    public void touch(Door door) {
        door.setCurrentState(door.getOpening());
    }

    @Override
    public void timeout(Door door) {

    }

    @Override
    public void complete(Door door) {

    }
}
