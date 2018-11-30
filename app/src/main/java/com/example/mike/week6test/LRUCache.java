package com.example.mike.week6test;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

    Integer capacity;
    LinkedList<Integer> keys;
    HashMap<Integer, Integer> values;

    public LRUCache(Integer capacity) {
        this.capacity = capacity;
        this.keys = new LinkedList<>();
        this.values = new HashMap<>();
    }

    public Integer get(Integer key) {
        return values.get( key );
    }

    public void put(Integer key, Integer value) {
        if ( keys.size() >= capacity ){
            values.remove( keys.getFirst() );
            keys.removeFirst();
        }
        keys.add(key);
        values.put(key, value);
    }
}
