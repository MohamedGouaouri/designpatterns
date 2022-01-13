package com.example.TD3.ex8;

import java.util.HashMap;

public class Cache implements DB {
    DictPersistent db;
    HashMap<Integer, Object> in_memory_db;

    public Cache(DictPersistent db){
        in_memory_db = new HashMap<>();
        // set what database we are doing the caching to
        this.db =  db;
    }

    @Override
    public boolean add(int key, Object object) {
        // write through (It depends on the cache policy)
        boolean added = db.add(key, object);
        if (added) in_memory_db.put(key, object); // add to the local in-memory db
        return added;
    }

    @Override
    public Object get(int key) throws KeyNotFoundException{
        if (in_memory_db.containsKey(key)){
            // if the key is found then return it
            return in_memory_db.get(key);
        }
        // delegate request
        return db.get(key);
    }
}
