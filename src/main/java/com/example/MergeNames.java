package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.
//For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) should return an array containing Ava, Emma, Olivia, and Sophia in any order.
public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(Arrays.asList(names1));
        uniqueNames.addAll(Arrays.asList(names2));

        String[] names = new String[uniqueNames.size()];

        int i = 0;
        for(String name : uniqueNames) {
            names[i] = name;
            i++;
        }

        return names;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}