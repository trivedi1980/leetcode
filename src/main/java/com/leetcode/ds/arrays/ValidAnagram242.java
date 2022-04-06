package com.leetcode.ds.arrays;

import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] != tc[i]) return false;
        }
        return true;
    }
}
