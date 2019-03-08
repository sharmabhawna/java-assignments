package com.step.assignments.loops;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static boolean isBorderIndex(int current, int edge){
        return current == 0 || current == edge - 1;
    }

    public static boolean isBorderPosition(int row, int column, int edge){
        return isBorderIndex(row, edge) || isBorderIndex(column, edge);
    }

    public static boolean isDiagonalPosition(int row, int column, int edge){
        return row == column || column == edge - (row + 1);
    }

    public static void printSquareStar(int number){
        for(int row = 0; row < number; row++){
            for(int column = 0; column < number; column++){
                if(isBorderPosition(row, column, number) || isDiagonalPosition(row, column, number))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
