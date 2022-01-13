package com.example.gof.creation.builder.theory;

public class Director {

    public void makeProduct(Builder builder){
        builder.reset();
        builder.buildPart1(1);
        builder.buildPart2(2);
        builder.buildPart3(3);
    }
}
