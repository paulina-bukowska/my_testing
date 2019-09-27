package com.example.codewars;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        if (walk.length == 10) {
            int result = 0;
            for (char ch : walk) {
                if(ch == 'n') {
                    result = result + 1;
                }
                else if(ch == 's') {
                    result = result - 1;
                }
                else if(ch == 'w') {
                    result = result + 30;
                }
                else if(ch == 'e') {
                    result = result - 30;
                }
                else return false;
            }
            return result == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] table1 = {'n','s','n','s','n','s','n','s','n','s'};
        char[] table2 = {'w','e','w','e','w','e','w','e','w','e','w','e'};
        char[] table3 = {'w'};
        char[] table4 = {'n','n','n','s','n','s','n','s','n','s'};

        System.out.println(isValid(table1));
        System.out.println(isValid(table2));
        System.out.println(isValid(table3));
        System.out.println(isValid(table4));
    }
}
