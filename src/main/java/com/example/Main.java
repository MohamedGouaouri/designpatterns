package com.example;


import com.example.gof.behavioural.chain_of_resp.ConcreteHandler1;
import com.example.gof.behavioural.chain_of_resp.ConcreteHandler2;
import com.example.gof.behavioural.chain_of_resp.ConcreteHandler3;
import com.example.td4.exo3.Closed;
import com.example.td4.exo3.Door;
import com.example.td4.exo3.DoorController;

public class Main {

    public static void main(String[] args) {
        DoorController controller = new DoorController(new Closed());
        Door door = new Door(new Closed());
        door.subscribe(controller);
        door.touch();
        door.touch();
        controller.show();
    }
}
