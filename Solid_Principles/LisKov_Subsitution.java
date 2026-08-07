package Solid_Principles;

/*
=========================================
LISKOV SUBSTITUTION PRINCIPLE (LSP)
=========================================

Definition:
!A child class should be able to replace
!its parent class without changing
!the correctness of the program.

!Simple Meaning:
! Wherever a parent object is used,
! its child object should also work correctly.

Why?
- Prevents unexpected behavior.
- Makes inheritance reliable.
- Encourages proper class design.

Bad Example:

Bird
   |
 Penguin

Bird has fly() method.
Penguin cannot fly.

If Penguin inherits Bird,
it is forced to implement fly(),
which is incorrect.

This violates LSP.

Good Example:

Animal
   |
 Dog
 Cat

Both Dog and Cat can perform
the behavior defined in Animal.

Interview Definition:
!"If a subclass cannot completely replace
!its superclass without changing the program's
!behavior, then the Liskov Substitution Principle
!is violated."

Real Life Example:

!Vehicle
!   |
! Car
! Bike

Both can start().

If someone creates a Vehicle reference,
both Car and Bike should work correctly.
*/

class Vehicle {

    public void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}

public class LisKov_Subsitution {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}