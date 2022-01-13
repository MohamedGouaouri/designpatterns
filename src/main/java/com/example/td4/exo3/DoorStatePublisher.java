package com.example.td4.exo3;

public interface DoorStatePublisher {
    void _notify();
    void subscribe(DoorStateSubscriber subscriber);
    void unsubscribe(DoorStateSubscriber subscriber);
}
