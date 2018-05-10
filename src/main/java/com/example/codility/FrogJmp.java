package com.example.codility;

// Count minimal number of jumps from position X to Y
public class FrogJmp {
    // Performance 0% :(
    // Time complexity O(Y-X)
    public int solution(int X, int Y, int D) {
        if(X == Y) {
            return 0;
        }
        int position = X;
        int counter = 0;
        while(position < Y) {
            position = position + D;
            counter++;
        }
        return counter;
    }

    // Performance 100% Hurray!!! :)
    // Time complexity O(1)
    public int betterSolution(int X, int Y, int D) {
        int numOfJmp = (Y - X) / D;
        if(((Y - X) % D) != 0) {
            numOfJmp++;
        }
        return numOfJmp;
    }

    public static void main (String[] args) {
        FrogJmp frogJmp = new FrogJmp();

        System.out.println(frogJmp.solution(10, 85, 30));
        System.out.println(frogJmp.betterSolution(10, 85, 30));
    }
}