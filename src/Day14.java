//OOP(Object Oriented Programming)
//Inheritance

//class Animal{
//    void eat(){
//        System.out.println("Eating");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Barking");
//    }
//}

//Create Vehicle class, Create Bike extends Vehicle, Add method in both
//class Vehicle{
//    void run(){
//        System.out.println("Vehicle is Running");
//    }
//}
//class Bike extends Vehicle{
//    void gears() {
//        System.out.println("Bike has Gears");
//    }
//}

//Polymorphism - Method Overloading(Compile time), Method Overriding(Runtime)

//Method Overloading (Compile time)-same method name, different params
//class Math{
//    int add(int a, int b){
//        return a + b;
//    }
//    int add(int a, int b, int c){
//        return a + b + c;
//    }
//}

//Method Overriding(Runtime)-child changes parent method
//class Animal{
//    void sound(){
//        System.out.println("Animal Sound");
//    }
//}
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Barking");
//    }
//}

//Create Calculator → overload add()
//class Calculator{
//    int calculate(int a, int b){
//        return a / b ;
//    }
//    int calculate(int a, int b, int c){
//        return a - b - c;
//    }
//    int calculate(int a, int b, int c, int d){
//        return a * b * c * d;
//    }
//    int calculate(int a, int b, int c, int d, int e){
//        return a + b + c + d + e;
//    }
//}

//Create Animal → Cat → override sound()
//class Animal{
//    void sound(){
//        System.out.println("Animal sound");
//    }
//}
//
//class Cat extends Animal{
//    void sound(){
//        System.out.println("meow");
//    }
//}

public class Day14 {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();

//        Bike b = new Bike();
//        b.run();
//        b.gears();

//        Math m = new Math();
//        System.out.println(m.add(5, 4));
//        System.out.println(m.add(5, 4, 6));

//        Dog d = new Dog();
//        d.sound();

//        Calculator c = new Calculator();
//        System.out.println("Addition: " + c.calculate(2, 3, 4, 5, 6));
//        System.out.println("Subtraction: " +  c.calculate(1, 3, 6));
//        System.out.println("Multiplication: " + c.calculate(9, 4, 5, 3));
//        System.out.println("Division: " + c.calculate(4, 2));

//        Cat ca = new Cat();
//        ca.sound();

    }
}

