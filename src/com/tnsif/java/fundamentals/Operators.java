package com.tnsif.java.fundamentals;


class Arithmetic {
    void display() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}

class Relational {
    void display() {
        int a = 10, b = 5;
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
    }
}

class Logical {
    void display() {
        int a = 10, b = 5;
        System.out.println("AND: " + (a > 5 && b < 10));
        System.out.println("OR: " + (a < 5 || b < 10));
        System.out.println("NOT: " + !(a > b));
    }
}

class Assignment {
    void display() {
        int a = 10;
        a += 5;
        System.out.println("Add and assign: " + a);
        a -= 3;
        System.out.println("Subtract and assign: " + a);
    }
}

class Unary {
    void display() {
        int a = 5;
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--a));
        System.out.println("Unary minus: " + (-a));
    }
}

public class Operators
{
    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();
        Relational re = new Relational();
        Logical lo = new Logical();
        Assignment as = new Assignment();
        Unary un = new Unary();

        System.out.println("Arithmetic Operators:");
        ar.display();

        System.out.println("\nRelational Operators:");
        re.display();

        System.out.println("\nLogical Operators:");
        lo.display();

        System.out.println("\nAssignment Operators:");
        as.display();

        System.out.println("\nUnary Operators:");
        un.display();
    }
}

