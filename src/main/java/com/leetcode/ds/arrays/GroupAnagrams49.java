package com.leetcode.ds.arrays;

import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ga = new HashMap<>();

        for (String each : strs) {
            String key = getKey(each);
            if (!ga.containsKey(key)) {
                ga.put(key, new ArrayList<>());
            }
            ga.get(key).add(each);
        }

        return new ArrayList<>(ga.values());
    }

    private String getKey(String each) {
        char[] chars = each.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
