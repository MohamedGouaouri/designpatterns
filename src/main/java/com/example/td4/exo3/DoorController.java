package com.example.td4.exo3;

public class DoorController implements DoorStateSubscriber {
    private DoorState doorState;
    public DoorController(DoorState state){
        doorState = state;
    }

    @Override
    public void update(DoorState doorState) {
        setDoorState(doorState);
    }


    public void show(){
        // simple show method
        System.out.println(doorState.getClass().getName());
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }
}
