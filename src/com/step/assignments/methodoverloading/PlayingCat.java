package com.step.assignments.methodoverloading;

public class PlayingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
//        return (summer && temperature > 25 && temperature < 45) || (!summer && temperature > 25 && temperature < 35);
        return (temperature > 25 ) && (( summer && temperature < 45) || (!summer && temperature < 35));
    }
}
