package com.tnsif.java.fundamentals;


import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }
}