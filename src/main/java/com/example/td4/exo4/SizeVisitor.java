package com.example.td4.exo4;

public class SizeVisitor implements Visitor{
    @Override
    public int visit(File file) {
        return file.calcSize();
    }

    @Override
    public int visit(Directory dir) {
        return dir.calcSize();
    }
}
