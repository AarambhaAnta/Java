package com.markblue.javaspeedrun.controlflow;

public class ControlFlow {
    public static void main(String[] args) {
        // Conditional Statements
        // If-else block
        System.out.println("Conditional (If-else) statement: ");
        System.out.println("-------------------");

        boolean isSunny = false;
        boolean isWarm = true;

        if(isSunny && isWarm) {
            System.out.println("Weather is sunny, let's go!");
            System.out.println("Weather is warm, let's go!");
        }else if(isWarm){
            System.out.println("Weather is warm, let's go!");
        }else {
            System.out.println("Weather is sunny, let's go!");
        }

        //--------------------------------------------------------------------------------------------------------------

    }
}
