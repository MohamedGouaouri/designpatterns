package com.example.TD2.ex1;

public class FileTraceFactory extends TraceFactory{
    // Qst 9: transform this class to a Singleton
    // steps:
    // 1- Make all constructors private
    // 2- create a static instance
    private static final FileTraceFactory instance = new FileTraceFactory();
    private FileTraceFactory(){}

    public static FileTraceFactory getInstance() {
        return instance;
    }
    @Override
    public FileTrace getTrace() {
        return new FileTrace();
    }
}
