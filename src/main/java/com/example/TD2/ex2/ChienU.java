package com.example.TD2.ex2;

public class ChienU extends AnimalU {
    @Override
    public Animal instantiateAnimal() {
        return Chien.getInstance();
    }
}
