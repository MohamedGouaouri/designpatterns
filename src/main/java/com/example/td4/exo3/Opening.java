package com.example.td4.exo3;

public class Opening implements DoorState{


    @Override
    public void touch(Door door) {
        door.setCurrentState(door.getClosing());
    }

    @Override
    public void timeout(Door door) {

    }

    @Override
    public void complete(Door door) {
        door.setCurrentState(door.getOpened());
    }
}
