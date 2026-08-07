package Solid_Principles;

/*
=========================================
INTERFACE SEGREGATION PRINCIPLE (ISP)
=========================================

Definition:
! A class should not be forced to implement
! interfaces that it does not use.

Simple Meaning:
! Instead of one large interface,
! create multiple small interfaces.

Why?
- Avoid unnecessary methods.
- Cleaner code.
- Easier to maintain.
- Better flexibility.

Bad Example:

interface Worker {
    work();
    eat();
}

! Robot implements Worker

! Robot can work,
but it cannot eat.

Still, Robot is forced to implement eat().

This violates ISP.

Good Example:
Split the interface.

Workable
    work()

Eatable
    eat()

Human implements Workable, Eatable

Robot implements Workable only

Interview Definition:
"Clients should not be forced to depend
on methods they do not use."

Real Life Example:

Remote Control

TV needs:
- Power
- Volume

AC needs:
- Power
- Temperature

Instead of one huge Remote interface,
create separate interfaces.
*/

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human is Working");
    }

    @Override
    public void eat() {
        System.out.println("Human is Eating");
    }
}

class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is Working");
    }
}

public class Interface_Segregation {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        human.work();
        human.eat();

        System.out.println();

        robot.work();

        // Robot doesn't have eat()
        // because it doesn't need it.
    }
}