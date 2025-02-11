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

//--------------------------------------------------------------------------------------------------------------

// Polymorphism -> {compile-time, run-time}
// Compile-time -> method overloading
// Compile-time -> different number of parameters
// Compile-time -> different type of parameter
// Compile-time -> different order of parameter
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    String sum(String a, String b){
        return a + b;
    }
    void display(String a, int b){
        System.out.println("String :" + a + ", Number : " + b);
    }
    void display(int a, String b){
        System.out.println("Number :" + a + ", String : " + b);
    }
}
// Run-time -> method overriding
// Overrides superclass/parent-class 's methods
// Writes new implementations for the superclass/parent-class 's methods
class Wood{
    void holds(){
        System.out.println("Wood is holding woods");
    }
}
class Container extends Wood{
    void holds(){
        System.out.println("Container is holding contents");
    }
}
class House extends Wood{
    void holds(){
        System.out.println("House is holding humans");
    }
}

//--------------------------------------------------------------------------------------------------------------

// Abstraction -> hides implementation details
// shows essential details
// Abstraction -> abstract class
abstract class Alien{
    public abstract void walks();
    public abstract void talks();
    void sleeps(){
        System.out.println("Sleeping ...");
    }
}
class Martian extends Alien{

    @Override
    public void walks() {
        System.out.println("Martian is walking");
    }

    @Override
    public void talks() {
        System.out.println("Martian is talking");
    }
}
// Abstraction -> Interface
interface Mobile{
    int numberOfBatteries = 1;
    void makeCall();
}
interface MusicPlayer{
    void makeMusic();
}
class SmartPhone implements Mobile, MusicPlayer{

    @Override
    public void makeCall() {
        System.out.println("SmartPhone is making call");
    }

    @Override
    public void makeMusic() {
        System.out.println("SmartPhone is making music");
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

        // Polymorphisms
        // Compile-time Polymorphisms

        System.out.println("Polymorphism: ");
        System.out.println("------------------");

        System.out.println("Compile-time: ");
        System.out.println("------------------");

        Calculator calculator = new Calculator();
        // sum method -> two parameter
        System.out.println("Sum of two numbers: " + calculator.sum(1, 2));
        // sum method -> three parameter
        System.out.println("Sum of three numbers: " + calculator.sum(1, 2, 3));
        // sum method -> two parameter -> different type
        System.out.println("Sum of two strings: " + calculator.sum("a", "b"));
        // display method -> different type of parameter
        calculator.display(36,"alpha");
        // display method -> different order of parameter
        calculator.display("beta",55);
        System.out.println();

        System.out.println("Run-time: ");   // Up-Casting
        System.out.println("------------------");

        Wood wood = new Wood();
        Wood wood2 = new Container();   // Superclass/parent-class reference -> upcasting
        Wood wood3 = new House();   // Superclass/parent-class reference -> upcasting

        wood.holds();   // Calls its own method
        wood2.holds();  // Run-time decision -> to call the object's method
        wood3.holds();  // Run-time decision -> to call the object's method
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Abstraction
        // Abstract class
        System.out.println("Abstraction: ");
        System.out.println("------------------");

        Martian martian = new Martian();
        martian.walks();
        martian.talks();
        martian.sleeps();
        System.out.println();
    }
}
