package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if(functionMap.containsValue(requiredValue))
        return true;
        else return false;

    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functioned = new HashMap<>();
        Integer[] listed = sourceList.toArray(new Integer[0]);
        for(Integer e : listed){
            functioned.put(e, (e*5+2));
        }
        return functioned;
    }
}
