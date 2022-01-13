package com.example.gof.creation.singleton;

public class Counter {
    private int count = 0;
    private static Counter instance;
    private Counter(){}
    public void increment(){
        count++;
    }

    private synchronized static void makeSync(){
        if (instance == null) instance = new Counter();
    }

    public static Counter instance(){
        if (instance == null){
            makeSync();
        }
        return instance;
    }
    public int getCount(){
        return count;
    }
}
