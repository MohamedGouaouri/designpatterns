package com.example.td4.exo4;

import java.util.ArrayList;

public class Directory implements GeneralFile{

    private ArrayList<GeneralFile> content = new ArrayList<>();

    public void addFile(GeneralFile file){
        if (!file.equals(this)){
            content.add(file);
        }
    }
    @Override
    public int calcSize() {
        int size = 0;
        for (GeneralFile file:content
             ) {
            size += file.calcSize();
        }
        return size;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }


    public ArrayList<GeneralFile> getContent() {
        return content;
    }
}
