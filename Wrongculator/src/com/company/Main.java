package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Wrongculator wrongculator = new Wrongculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int i = sc.nextInt();
        System.out.print("Write another number:");
        int j = sc.nextInt();
        System.out.println("Add(1), Subtract(2), Divide(3), Multiply(4)");
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println("The result is: " + wrongculator.add(i, j));
        } else if (k == 2) {
            System.out.println("The result is: " + wrongculator.sub(i, j));
        } else if (k == 3) {
            System.out.println("The result is: " + wrongculator.div(i, j));
        } else if (k == 4) {
            System.out.println("The result is: " + wrongculator.mul(i, j));
        }

    }
}
