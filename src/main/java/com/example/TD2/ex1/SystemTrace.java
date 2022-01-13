package com.example.TD2.ex1;

public class SystemTrace implements Trace {
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) System.out.println(message);
    }

    @Override
    public void error(String message) {
        if (debug) System.err.println(message);
    }
}
