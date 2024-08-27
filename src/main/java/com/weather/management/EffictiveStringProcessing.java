package com.weather.management;

import java.util.Arrays;
import java.util.List;

class EffictiveStringProcessing {

    public static List<Boolean> findSubstrings(String S, String[] Q) {
        return Arrays.stream(Q).toList().stream().map(S::contains).toList();
    }

    public static void main(String[] args) {
        List<Boolean> result = EffictiveStringProcessing.findSubstrings("abcdefghijklmnopqrstuvwxyz", new String[]{"abc", "def", "mno", "xyz", "ijk", "pqr", "lok"});
        System.out.println(result);
    }
}
