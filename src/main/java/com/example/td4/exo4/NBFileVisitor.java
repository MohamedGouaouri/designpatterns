package com.example.td4.exo4;

public class NBFileVisitor implements Visitor{
    @Override
    public int visit(File file) {
        return 0;
    }

    @Override
    public int visit(Directory dir) {

        return dir.getContent().size();
    }
}
