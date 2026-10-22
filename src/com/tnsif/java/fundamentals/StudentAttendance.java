package com.tnsif.java.fundamentals;

import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int present = 0;
        int absent = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter attendance of student " + i + " (1-Present, 0-Absent): ");
            int attendance = sc.nextInt();

            if (attendance == 1) {
                present++;
            } else if (attendance == 0) {
                absent++;
            } else {
                System.out.println("Invalid input!");
                i--;
            }
        }

        System.out.println("Total Present: " + present);
        System.out.println("Total Absent: " + absent);

        sc.close();
    }
}