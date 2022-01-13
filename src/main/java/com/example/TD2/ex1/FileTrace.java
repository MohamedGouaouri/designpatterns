package com.example.TD2.ex1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileTrace implements Trace{
    private boolean debug;
    private FileOutputStream writer;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug){
            try {
                writer = new FileOutputStream("debug.log");
                writer.write(message.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void error(String message) {
        if (debug){
            try {
                writer = new FileOutputStream("error.log");
                writer.write(message.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
