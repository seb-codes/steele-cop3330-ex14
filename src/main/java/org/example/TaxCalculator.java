/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        final double tax = 0.055;
        double total_tax = 0.0;
        double subtotal = 0.0;

        Scanner scan = new Scanner(System.in);
        Scanner scanstate = new Scanner(System.in);


        System.out.print("What is the order amount? ");
        Integer principle = scan.nextInt();

        System.out.print("What is the state? ");
        String state = scanstate.nextLine();

        subtotal = principle * 1.00;

        if(state.equals("WI")){
            System.out.println(String.format("The subtotal is $%.02f.",subtotal));
            total_tax = subtotal * tax;
            System.out.println(String.format("The tax is $%.02f.",total_tax));
        }
        double total = total_tax + subtotal;

        System.out.println(String.format("The total is $%.02f.",total));


    }
}
