package Solid_Principles;

/*
=========================================
OPEN CLOSED PRINCIPLE (OCP)
=========================================

Definition:
A class should be OPEN for Extension
but CLOSED for Modification.

Simple Meaning:
Don't modify existing code to add new features.
Instead, create new classes.

Bad Example:

class Animal {
    void sound(String animal){
        if(animal.equals("Dog"))
            System.out.println("Bark");
        else if(animal.equals("Cat"))
            System.out.println("Meow");
    }
}

Problem:
If tomorrow we add Lion,
we must modify this class again.

This violates OCP.

Good Example:
Use an interface.
Each animal will implement its own sound().
To add Lion, just create Lion class.
No existing code changes.
*/

interface Animal {
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Open_Closed {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        // Tomorrow if we want Lion,
        // simply create:
        //
        // class Lion implements Animal {
        // public void sound() {
        // System.out.println("Roar");
        // }
        // }
        //
        // No existing code is modified.
    }
}