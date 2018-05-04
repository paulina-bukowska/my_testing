package com.example.string;

// Java program to demonstrate difference between String, StringBuilder and StringBuffer
// Concatenates to String
public class Concatenates {
    public static void concat1(String s1) {
        s1 = s1 + "world!";
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
        s2.append("world!");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
        s3.append("world!");
    }

    public static void main(String[] args) {
        String s1 = "Hello ";
        concat1(s1); // s1 is not changed
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Hello ");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Hello ");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}