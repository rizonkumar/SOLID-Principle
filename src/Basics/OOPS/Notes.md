Sure! Here’s a **complete short note on OOPs Concepts in Java** — neatly formatted in **Markdown (MD)** and includes a **simple Java example** for better understanding.

---

# 🌟 Object-Oriented Programming (OOP) Concepts in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**, which contain **data** and **methods**.

---

## 🧩 1. Class

A **class** is a blueprint or template for creating objects.
It defines **fields (variables)** and **methods (functions)**.

```java
class Animal {
    String name;
    void speak() {
        System.out.println(name + " makes a sound");
    }
}
```

---

## 🐾 2. Object

An **object** is an instance of a class. It has its own **state** and **behavior**.

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(); // Object creation
        dog.name = "Dog";
        dog.speak();
    }
}
```

---

## ⚙️ 3. Constructor

A **constructor** initializes an object when it is created.
It has the same name as the class and **no return type**.

```java
class Person {
    String name;
    Person(String n) { // Constructor
        name = n;
    }
}
```

---

## 🔁 4. `this` Keyword

`this` refers to the **current object** in a method or constructor.

```java
class Student {
    String name;
    Student(String name) {
        this.name = name; // Refers to current object's variable
    }
}
```

---

## 🧱 5. Inheritance

Inheritance allows one class to **inherit fields and methods** from another class.

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
```

---

## 🔄 6. Polymorphism

**Polymorphism** means "many forms" — allows one interface to be used for different data types.
It can be **compile-time (method overloading)** or **runtime (method overriding)**.

```java
// Compile-time Polymorphism
class MathOp {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

// Runtime Polymorphism
class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void sound() { System.out.println("Dog barks"); } }
```

---

## 🧬 7. Encapsulation

Encapsulation means **binding data and methods** together and keeping them **safe from outside interference** using **private** variables and **public getters/setters**.

```java
class Account {
    private int balance = 1000;
    public int getBalance() { return balance; }
    public void deposit(int amount) { balance += amount; }
}
```

---

## 🔒 8. Abstraction

Abstraction hides complex implementation and shows only the **necessary details** using **abstract classes** or **interfaces**.

```java
abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}
```

---

## 🧩 9. Interface

An **interface** defines a **contract** — a set of abstract methods a class must implement.
It supports **multiple inheritance**.

```java
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
```

---

## 🪜 10. `super` Keyword

`super` is used to **call parent class methods** or **constructors**.

```java
class Animal {
    Animal() { System.out.println("Animal created"); }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog created");
    }
}
```

---

## 💡 Full Example

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    String name;
    Dog(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " barks!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.sound();
    }
}
```

---

## 🧠 Summary of 5 Core OOP Principles

| Concept            | Meaning                                                    |
| ------------------ | ---------------------------------------------------------- |
| **Encapsulation**  | Binding data and methods together, hiding internal details |
| **Abstraction**    | Showing only essential features, hiding complex logic      |
| **Inheritance**    | Reusing code by deriving new classes from existing ones    |
| **Polymorphism**   | One name, many forms (method overriding/overloading)       |
| **Class & Object** | Class = Blueprint, Object = Instance                       |

---

