package com.example.TD2.ex2;

public class Chien implements Animal{
    private static final Chien instance = new Chien();
    private Chien(){}
    public static Chien getInstance() {
        return instance;
    }

}
