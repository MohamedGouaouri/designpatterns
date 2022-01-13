package com.example.gof.behavioural.chain_of_resp;

public abstract class Handler {
    Handler next;

    public void setNext(Handler next){
        this.next = next;
    }
    abstract public void handle(Object request);
}
