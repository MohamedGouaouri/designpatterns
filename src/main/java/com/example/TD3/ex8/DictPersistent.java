package com.example.TD3.ex8;

import java.util.HashMap;

public class DictPersistent implements DB {
    private HashMap<Integer, Object> db;

    public DictPersistent(){
        db = new HashMap<>();
    }
    @Override
    public boolean add(int key, Object object) {
        try {
            db.put(key, object);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Override
    public Object get(int key) throws KeyNotFoundException {
        Object value = db.get(key);
        if (value == null) throw new KeyNotFoundException();
        return value;
    }
}
