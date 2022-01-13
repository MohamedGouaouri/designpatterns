package com.example.td4.exo4;

public interface Visitor {
    int visit(File file);
    int visit(Directory dir);
}
