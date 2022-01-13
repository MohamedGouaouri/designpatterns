package com.example.TD2.ex2;

public class Chat implements Animal {
    private static final Chat instance = new Chat();
    private Chat(){}
    public static Chat getInstance() {
        return instance;
    }
    public String getName(){
        return "saimon";
    }
}
