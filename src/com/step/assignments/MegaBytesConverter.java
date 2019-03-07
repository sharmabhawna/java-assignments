package com.step.assignments;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
            return;
        }
        int megaBytes = kiloBytes/1024;
        int leftKiloBytes = kiloBytes%1024;
        System.out.println(kiloBytes + "KB = " + megaBytes + "MB " + leftKiloBytes + " KB");
    }
}
