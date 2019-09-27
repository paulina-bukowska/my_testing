package com.example.codewars;

// You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to
// an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a
// Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings
// representing directions to walk (eg. ['n', 's', 'w', 'e']). You know it takes you one minute to traverse one city
// block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes
// (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
//
//Note: you will always receive a valid array containing a random assortment of direction letters
// ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
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
