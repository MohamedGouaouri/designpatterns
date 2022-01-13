package com.example.TD3.ex6;

public interface StackImplementations {
    void push(int e);
    int pop() throws EmptyStackException;
    int getSize();
    boolean isEmpty();
}
