package com.example.TD2.ex2;

public class ChatU extends AnimalU {
    @Override
    public Animal instantiateAnimal() {
        return Chat.getInstance();
    }
}
