package com.markblue.javaspeedrun.oops;

// Class -> blue-print of a structure
// in laymen -> blue-print of non-primitive datatype (user defined)
class Car{
    String name;    // Fields -> variables
    int speed;  // Fields -> variables

    void drive(){   // Methods -> functions that are available to the user
        System.out.println("Driving: " + name);
        System.out.println("Speed: " + speed);
    }
}
public class Oops {
    public static void main(String[] args) {

        // Object-Oriented Programming
        System.out.println("Oops: ");
        System.out.println("-------------------");

        // Object -> structure made on the blue-print
        // Allocated memory/space
        Car car = new Car();
        car.name = "Rolls-Royes";
        car.speed = 80;
        car.drive();
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

    }
}
