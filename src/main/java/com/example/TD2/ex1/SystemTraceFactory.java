package com.example.TD2.ex1;

public class SystemTraceFactory extends TraceFactory{
    @Override
    public Trace getTrace() {
        return new SystemTrace();
    }
}
