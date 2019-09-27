package com.example.recruitment;

import java.util.ArrayList;
import java.util.HashSet;

// Find the maximum number of distinct values that appear on a path starting at the root of a given binary tree
public class BinaryTree {
    public int solution(Tree T) {
        ArrayList<HashSet<Integer>> allPaths = traverseTree(T);

        int theLongestPathSize = 0;
        for (HashSet<Integer> path : allPaths) {
            if (path.size() > theLongestPathSize) {
                theLongestPathSize = path.size();
            }
        }
        return theLongestPathSize;
    }

    private ArrayList<HashSet<Integer>> traverseTree(Tree T) {
        if (T.l == null && T.r == null){
            HashSet<Integer> set = new HashSet<>();
            set.add((T.x));
            ArrayList<HashSet<Integer>> allSets = new ArrayList<>();
            allSets.add(set);
            return allSets;
        }

        ArrayList<HashSet<Integer>> result = new ArrayList();

        if (T.l != null) {
            ArrayList<HashSet<Integer>> left = traverseTree(T.l);
            for(HashSet<Integer> set : left) {
                set.add(T.x);
            }
            result.addAll(left);
        }

        if (T.r != null) {
            ArrayList<HashSet<Integer>> right = traverseTree(T.r);
            for(HashSet<Integer> set : right) {
                set.add(T.x);
            }
            result.addAll(right);
        }

        return result;
    }
}