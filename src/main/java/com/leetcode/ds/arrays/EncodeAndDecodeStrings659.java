package com.leetcode.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings659 {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str + ",");
        }
        return sb.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        String[] items = str.split(",");
        return new ArrayList<>(Arrays.asList(items));
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings659 instance = new EncodeAndDecodeStrings659();
        List<String> list = new ArrayList<>();
        list.add("lint");
        list.add("code");
        list.add("love");
        list.add("you");

        String encodedString = instance.encode(list);

        List<String> list2 = instance.decode(encodedString);
        System.out.println(list2);
    }
}
