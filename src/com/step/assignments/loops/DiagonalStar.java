package com.step.assignments.loops;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number){
        for(int row = 0; row < number; row++){
            for(int column = 0; column < number; column++){
                if(row == 0 || row == number -1 || column == 0 || column == number - 1 || row == column || column == number - (row + 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
