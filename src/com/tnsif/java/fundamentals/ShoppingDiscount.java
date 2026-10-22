package com.tnsif.java.fundamentals;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        if (amount >= 1000) {
            System.out.println("Eligible for Discount");
        } else {
            System.out.println("Not Eligible for Discount");
        }

        sc.close();
    }
}