package com.example;


import com.example.td4.exo4.*;

public class Main {

    public static void main(String[] args) {
        File file1 = new File(10);
        File file2 = new File(10);
        File file3 = new File(10);
        Directory dir = new Directory();
        dir.addFile(file1);
        dir.addFile(file2);
        Visitor sizeVisitor = new SizeVisitor();
        Visitor nbFilesVisitor = new NBFileVisitor();

        System.out.println(dir.accept(sizeVisitor));
        System.out.println(dir.accept(nbFilesVisitor));
    }
}
