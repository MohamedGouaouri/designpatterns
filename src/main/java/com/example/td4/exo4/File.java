package com.example.td4.exo4;

public class File implements GeneralFile{

    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int calcSize() {
        return size;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public void setSize(int size) {
        this.size = size;
    }

}
