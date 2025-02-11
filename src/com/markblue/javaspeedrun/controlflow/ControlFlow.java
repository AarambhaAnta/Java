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
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Mapping Integers to week days using If-else block
        // Inefficient way, as it will check all the conditions, until one runs

        int day = 3;
        String dayName;

        if(day==1){
            dayName = "Monday";
        }else if(day==2){
            dayName = "Tuesday";
        }else if(day==3){
            dayName = "Wednesday";
        }else if(day==4){
            dayName = "Thursday";
        }else if(day==5){
            dayName = "Friday";
        }else if(day==6){
            dayName = "Saturday";
        }else if(day==7){
            dayName = "Sunday";
        }else{
            dayName = "Invalid day";
        }

        System.out.println("Map Integer-Week days(If-else): ");
        System.out.println("-------------------");

        System.out.println("Integer: " + day);
        System.out.println("Day: " + dayName);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Re-Use the 'day' and 'dayName' variables
        // Using Switch-Case
        // Direct jump without running all previous cases

        day = 5;

        switch(day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid day";
        }

        System.out.println("Map Integer-Week days(switch-case): ");
        System.out.println("-------------------");

        System.out.println("Switch: " + day);
        System.out.println("Day: " + dayName);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Ternary Operator (kind of 'shorthand' of If-else)
        int a = 3;
        boolean isEven = a%2==0?true:false;

        System.out.println("Ternary Operator: ");
        System.out.println("-------------------");

        System.out.println("integer: " + a);
        System.out.println("isEven: " + isEven);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Loops - flow control statements

        System.out.println("Loops : ");
        System.out.println("-------------------");

        // while loops -> runs if condition is ture
        System.out.println("While loops: ");
        System.out.println("-------------------");

        int i = 0;
        while(i<10){
            System.out.println("i: " + i);
            i++;
        }
        System.out.println();

        // for loop -> runs if condition is true
        System.out.println("for loops : ");
        System.out.println("-------------------");

        for (int j = 0; j < 10; j++) {
            System.out.println("j: " + j);
        }
        System.out.println();

        // do-while loop -> runs at-least ones and then check the condition

        int k = 102;
        do{
            System.out.println("k: " + k);
        }while(k<100);
        System.out.println();
    }
}
