package Solid_Principles;

/*
=========================================
DEPENDENCY INVERSION PRINCIPLE (DIP)
=========================================

Definition:
! High-level modules should not depend
! on low-level modules.

! Both should depend on abstractions
! (Interfaces or Abstract Classes).

Simple Meaning:
Don't directly create objects of a class.
Depend on an interface instead.

Why?
- Loose Coupling
- Easy to change implementations
- Easy to test
- More flexible and maintainable

Bad Example:

class Computer{
    Keyboard keyboard = new Keyboard();
}

Problem:
If tomorrow we replace Keyboard
with WirelessKeyboard,
we must modify Computer.

This violates DIP.

Good Example:

Keyboard (Interface)
      ↑
NormalKeyboard
WirelessKeyboard

Computer depends on Keyboard interface.

Now we can use any keyboard
without changing Computer.

Interview Definition:
! "High-level modules should depend on
! abstractions rather than concrete implementations."

Real Life Example:

A Mobile Charger.

The phone depends on the charging port
(USB-C), not on a specific charger brand.

Samsung Charger ✔
OnePlus Charger ✔
Google Charger ✔

Phone never changes.
Only the charger changes.
*/

interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing using Wired Keyboard");
    }
}

class WirelessKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing using Wireless Keyboard");
    }
}

class Computer {

    private Keyboard keyboard;

    // Dependency Injection
    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start() {
        keyboard.type();
    }
}

public class Dependency_Inverrsion {

    public static void main(String[] args) {

        Keyboard keyboard = new WiredKeyboard();

        Computer computer = new Computer(keyboard);

        computer.start();

        // Tomorrow we can simply write:
        // Keyboard keyboard = new WirelessKeyboard();
        // No changes inside Computer class.
    }
}