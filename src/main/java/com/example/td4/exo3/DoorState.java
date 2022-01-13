package com.example.td4.exo3;

public interface DoorState {
    void touch(Door door);
    void timeout(Door door);
    void complete(Door door);
}
