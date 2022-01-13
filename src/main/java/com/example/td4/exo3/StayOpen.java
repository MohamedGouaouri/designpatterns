package com.example.td4.exo3;

public class StayOpen implements DoorState{


    @Override
    public void touch(Door door) {
        door.setCurrentState(door.getClosing());
    }

    @Override
    public void timeout(Door door) {

    }

    @Override
    public void complete(Door door) {

    }
}
