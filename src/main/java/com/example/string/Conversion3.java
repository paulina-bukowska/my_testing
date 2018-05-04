package com.example.string;

// demonstrate conversion from StringBuffer to StringBuilder or vice-versa
public class Conversion3 {
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Geeks");

        // conversion from StringBuffer object to StringBuilder
        String str = sbr.toString();
        StringBuilder sbl = new StringBuilder(str);

        System.out.println(sbl);
    }
}