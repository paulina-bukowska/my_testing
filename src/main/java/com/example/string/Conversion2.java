package com.example.string;

// demonstrate conversion from StringBuffer and StringBuilder to String
public class Conversion2 {
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Geeks");
        StringBuilder sbl = new StringBuilder("Geeks");

        // conversion from StringBuffer object to String
        String str = sbr.toString();
        System.out.println(str);

        // conversion from StringBuilder object to String
        String str1 = sbl.toString();
        System.out.println(str1);

        // changing StringBuffer object sbr but String object(str) doesn't change
        sbr.append("ForGeeks");
        System.out.println(sbr);
        System.out.println(str);
        System.out.println(str1);
    }
}