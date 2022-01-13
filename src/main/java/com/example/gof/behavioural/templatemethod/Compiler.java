package com.example.gof.behavioural.templatemethod;

public abstract class Compiler {

    // this is a template method
    public void compile(){
        open();
        tokenize();
        parse();
        optimize();
        codegen();
        close();
        printGenCode();
    }

    // those are the steps
    public void open(){
        // open the file
    }
    public void close(){
        // close the file
    }
    public void printGenCode(){
        // prints the generated code
    }

    abstract public void tokenize();
    abstract public void parse();
    abstract public void optimize();
    abstract public void codegen();
}
