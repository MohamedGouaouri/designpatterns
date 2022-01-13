package com.example.td4.exo3;

import java.util.ArrayList;

public class Door implements DoorStatePublisher{
    // we aggregate states
    private final DoorState opening = new Opening();
    private final DoorState opened = new Opened();
    private final DoorState closing = new Closing();
    private final DoorState closed = new Closed();
    private final DoorState stayOpened = new StayOpen();
    private DoorState currentState;

    // List of subscribers
    private ArrayList<DoorStateSubscriber> subscribers = new ArrayList<>();

    public Door(DoorState initState){
        this.currentState = initState;
    }

    public void touch(){
        currentState.touch(this);
        _notify();
    }
    public void timeout(){
        currentState.timeout(this);
        _notify();
    }
    public void complete(){
        currentState.complete(this);
        _notify();
    }

    public void setCurrentState(DoorState currentState) {
        this.currentState = currentState;
    }

    public DoorState getCurrentState() {
        return currentState;
    }

    public DoorState getOpening() {
        return opening;
    }

    public DoorState getOpened() {
        return opened;
    }

    public DoorState getClosing() {
        return closing;
    }

    public DoorState getClosed() {
        return closed;
    }

    public DoorState getStayOpened() {
        return stayOpened;
    }

    @Override
    public void _notify() {
        for (DoorStateSubscriber subscriber:subscribers
             ) {
            subscriber.update(currentState);
        }
    }

    @Override
    public void subscribe(DoorStateSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(DoorStateSubscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
