package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (var entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }

        result.sort((a, b) -> {
            int lengthComparison = Integer.compare(b.length(), a.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            } else {
                return b.compareTo(a);
            }
        });

        return result;
    }
}
