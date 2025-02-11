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

// Encapsulation -> hiding the implementation details
// Providing methods to change or access
class Bus{
    private String name;
    private int speed;

    public Bus(String name){ // Constructor -> Method for user to modify/set details
        this.name = name;
    }

    // Method -> modify/set the speed
    // Used -> to add conditions on the modifications
    public void setSpeed(int speed){
        if(speed > 0){
            this.speed = speed;
        }else{
            this.speed = 0;
            System.out.println("Not a valid speed!!!");
        }
    }

    public void drive(){
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

        // Encapsulation
        System.out.println("Encapsulation: ");
        System.out.println("------------------");

        Bus bus = new Bus("Bus");
        bus.setSpeed(30);
        bus.drive();
        System.out.println();
    }
}
