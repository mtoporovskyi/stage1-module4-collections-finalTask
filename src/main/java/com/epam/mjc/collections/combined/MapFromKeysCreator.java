package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (String sourceKey : sourceMap.keySet()) {
            int keyLength = sourceKey.length();
            result.putIfAbsent(keyLength, new HashSet<>());
            result.get(keyLength).add(sourceKey);
        }

        return result;
    }
}
