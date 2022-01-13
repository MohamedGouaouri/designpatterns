package com.example.td4.exo3;

public class Opened implements DoorState{


    @Override
    public void touch(Door door) {
        door.setCurrentState(door.getStayOpened());
    }

    @Override
    public void timeout(Door door) {
        door.setCurrentState(door.getClosing());
    }

    @Override
    public void complete(Door door) {

    }
}
