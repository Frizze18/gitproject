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
        System.out.println("The result is: " + wrongculator.add(i, j));

    }
}
