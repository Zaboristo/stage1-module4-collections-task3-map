package com.epam.mjc.collections.map;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] delimin= sentence.toLowerCase().split("\\W");
        for(int i = 0; i<delimin.length; i++){
            if(result.containsKey(delimin[i])){
                int now = result.get(delimin[i]);
                result.replace(delimin[i], (now + 1));
            }
            else if (!(delimin[i].equals("")))
                result.put(delimin[i], 1);
        }
        result.remove("");
        return result;
    }
}
