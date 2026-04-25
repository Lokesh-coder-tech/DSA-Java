//OOP(Object Oriented Programming)
//Abstraction- Only showing important details

//Using Abstract Class: (Abstract → incomplete class)

//abstract class Vehicle{
//   abstract void start();
//
//   void fuel(){
//       System.out.println("Vehicle needs fuel");
//   }
//}
//
//class Car extends Vehicle{
//    void start(){
//        System.out.println("Car started with key");
//    }
//}

//Using Interface: (Interface → fully abstract (rules only))

//interface Animal{
//    void sound();
//}
//
//class Dog implements Animal{
//    public void sound(){
//        System.out.println("Dog barks");
//    }
//}

//Create abstract class Shape, Method area(), Implement in Circle

//abstract class Shape{
//    abstract void area();
//
//    void parameter(){
//        System.out.println("parameter of circle is: 2*pie*r");
//    }
//}
//
//class Circle extends Shape{
//    void area(){
//        System.out.println("area of circle is: pie*r^2");
//    }
//}

//Constructor-
//             Constructor ka naam = class name,
//             Return type nahi hota (even void bhi nahi),
//             Automatically call hota hai,
//             Object initialization ke liye use hota hai,

//class Student{
//    String name;
//
//    Student(){
//        System.out.println("Object created");
//    }
//}

//class Player{
//    Player(){
//        System.out.println("Player Object created");
//    }
//}

//Constructor for Initialization:-
//class Student{
//    String name;
//    int age;
//
//    Student(String name, int age){
//        this.name = name;       //this - current object
//        this.age = age;
//    }
//    void display(){
//        System.out.println("Name is: " + name + "," + " Age is: " + age);
//    }
//}

//Constructor Overloading :- Same constructor name, different parameters

//class Student{
//    String name;
//    int age;
//
//    Student(String name){
//        this.name = name;
//    }
//    Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    void display(){
//        System.out.println(name);
//    }
//    void display2(){
//        System.out.println(name + ", " + age);
//    }
//}

//Create Car class, brand, speed, constructor se initialize
//class Car{
//    String brand;
//    int speed;
//
//    Car(String brand, int speed){
//        this.brand = brand;
//        this.speed = speed;
//    }
//    void display(){
//        System.out.println("Car Brand is: " + brand + ", " + "Car speed is: " + speed+"km/h");
//    }
//}

//Create Student, name, marks, constructor use karo
//class Student{
//    String name;
//    int marks;
//
//    Student(String name, int marks){
//        this.name = name;
//        this.marks = marks;
//    }
//    void display(){
//        System.out.println("Student name is: " + name + ", " + name + " obtained: "  + marks+"%");
//    }
//}

//Create Employee, name, salary, display method
class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee name: " + name + ", " + " Salary: " + salary+"$");
    }
}

public class Day15 {
    public static void main(String[] args) {
//      Car c = new Car();
//      c.start();

//      Dog d = new Dog();
//      d.sound();

//      Circle c = new Circle();
//      c.area();

//      Student s1 = new Student();
//      Player p1 = new Player();

//      Student s2 = new Student("Lokesh", 20);
//      s2.display();

//      Student s3 = new Student("Lokesh");
//      s3.display();
//      Student s4 = new Student("Lokesh", 20);
//      s4.display2();

//      Car c = new Car("Ferrari", 340);
//      c.display();

//      Student s5 = new Student("Lucky", 97);
//      s5.display();

        Employee e = new Employee("Lokesh", 2000);
        e.display();


    }
}
