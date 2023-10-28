package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> sult = new HashMap<>();
        for(Map.Entry<Integer, String> e : sourceMap.entrySet()){
            int key = e.getKey();
            String value = e.getValue();
            if(sult.containsKey(value)){
                Integer old = sult.get(value);
                sult.replace(value, compare(old, key));
            }
            else
                sult.put(value,key);
        }
        return sult;
    }

    public Integer compare(Integer a, Integer b){
        if (a < b)
            return a;
        else return b;
    }
}
