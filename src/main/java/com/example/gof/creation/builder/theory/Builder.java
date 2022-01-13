package com.example.gof.creation.builder.theory;

public interface Builder {
    void reset();
    void buildPart1(int attr);
    void buildPart2(int attr);
    void buildPart3(int attr);
}
