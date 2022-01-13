package com.example.TD3.ex8;

public interface DB {
    boolean add(int key, Object object);
    Object get(int key) throws KeyNotFoundException;
}
