package Encapsulation;
public class Encapsulation {
    private double balance; // data hidden

    // Encapsulation binds data and methods together and hides data using access
    // modifiers.
    // It protects data from direct access and allows controlled access via methods.

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}

