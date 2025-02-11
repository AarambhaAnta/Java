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

//--------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

// Inheritance -> allows method reusability
// shares properties/behaviours to the subclass/child-class
class Mammals {   // Parent class
    void eat(){
        System.out.println("This mammal is eating");
    }
}
// Single Inheritance -> single superclass/parent-class, single subclass/child-class
class Cat extends Mammals {   // Child class
    void walk(){
        System.out.println("This Cat is walking");
    }
}
// Hierarchical Inheritance -> single superclass/parent-class, multiple subclass/child-class
// Both 'Cat' & 'Dog' class inherited the eat() method -> multiple child
class Dog extends Mammals {
    void run(){
        System.out.println("This Dog is running");
    }
}
// Multilevel Inheritance -> Ancestor chain -> {grandfather -> parent -> child}
class Animal extends Mammals {
    void talk(){
        System.out.println("This animal is talking");
    }
}
class Human extends Animal {
    void society(){
        System.out.println("The humans makes society");
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

        //--------------------------------------------------------------------------------------------------------------

        // Inheritance
        System.out.println("Inheritance: ");
        System.out.println("------------------");

        // Single Inheritance
        System.out.println("Single Inheritance: ");
        System.out.println("------------------");

        Cat cat = new Cat();
        cat.eat();  // This method is inherited from its superclass/parent-class 'Mammals'
        cat.walk();
        System.out.println();

        // Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance: ");
        System.out.println("------------------");

        Dog dog = new Dog();
        dog.eat();  // This method is inherited from its superclass/parent-class 'Mammals'
        dog.run();
        cat.eat();
        cat.walk();
        System.out.println();

        // Multilevel Inheritance
        System.out.println("Multi-level Inheritance: ");
        System.out.println("------------------");

        Animal animal = new Animal();
        animal.eat();   // Inherited this method from its superclass/parent-class 'Mammals'
        animal.talk();
        System.out.println();

        Human human = new Human();
        human.eat();    // Inherited method -> from 'Animal' superclass -> 'Animal' inherited from its superclass 'Mammals'
        human.talk();
        human.society();
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

    }
}
