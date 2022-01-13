package com.example.gof.behavioural.chain_of_resp;

public class ConcreteHandler1 extends Handler{

    private boolean canHandle;

    @Override
     public void handle(Object request) {
        if (canHandle){
            System.out.println("Request Handled by: " + getClass().toString());
        }else {
            super.next.handle(request);
        }
    }

    public void setCanHandle(boolean canHandle) {
        this.canHandle = canHandle;
    }

}
