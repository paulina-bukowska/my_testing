package com.example.recruitment;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTestSuite {
    BinaryTree binaryTree = new BinaryTree();

    @Test
    public void testSolution1() {
        // Given
        Tree tree1 = new Tree(5,null,null);
        Tree tree2 = new Tree(4,tree1,null);
        Tree tree3 = new Tree(5,tree2,null);
        Tree tree4 = new Tree(1,null,null);
        Tree tree5 = new Tree(6,null,null);
        Tree tree6 = new Tree(6,tree4,tree5);
        Tree tree7 = new Tree(4,tree3,tree6);

        // When
        int result1 = binaryTree.solution(tree7);
        int result2 = binaryTree.solution(tree3);
        int result3 = binaryTree.solution(tree6);

        // Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(2, result3);
    }

    @Test
    public void testSolution2() {
        // Given
        Tree tree1 = new Tree(5,null,null);
        Tree tree2 = new Tree(4,tree1,null);
        Tree tree3 = new Tree(5,tree2,null);
        Tree tree4 = new Tree(1,null,null);
        Tree tree5 = new Tree(6,null,null);
        Tree tree6 = new Tree(6,tree4,tree5);
        Tree tree7 = new Tree(4,tree3,tree6);
        Tree tree8 = new Tree(4,null,null);
        Tree tree9 = new Tree(3,tree8,null);
        Tree tree10 = new Tree(2,tree9,null);
        Tree tree11 = new Tree(1,tree10,tree7);
        Tree tree12 = new Tree(6,null,null);
        Tree tree13 = new Tree(8,tree11,tree12);

        // When
        int result1 = binaryTree.solution(tree13);
        int result2 = binaryTree.solution(tree11);
        int result3 = binaryTree.solution(tree9);

        // Then
        Assert.assertEquals(5, result1);
        Assert.assertEquals(4, result2);
        Assert.assertEquals(2, result3);
    }
}