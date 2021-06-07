///*
//// *  UCF COP3330 Summer 2021 Assignment 17
//// *  Copyright 2021 Steven Ortiz
//// */

//BAC = (A × 5.14 / W × r) − .015 × H

//Enter a 1 is you are male or a 2 if you are female: 1
//How many ounces of alcohol did you have? 3
//What is your weight, in pounds? 175
//How many hours has it been since your last drink? 1

//Your BAC is 0.049323
//It is legal for you to drive.

//Enter a 1 is you are male or a 2 if you are female: 1
//How many ounces of alcohol did you have? 5
//What is your weight, in pounds? 175
//How many hours has it been since your last drink? 1

//Your BAC is 0.092206
//It is not legal for you to drive.

package org.example;

import java.text.DecimalFormat;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    private static double gender() {

        for (;;) {

            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
            String gender = in.nextLine();
            double gender1 = Double.parseDouble(gender);
            if (gender1 == 1 || gender1 == 2) {
                return gender1;
            }
        }
    }

    private static double ounces () {

        System.out.print("How many ounces of alcohol did you have? ");
        return in.nextDouble();
    }

    private static double weight () {

        System.out.print("What is your weight, in pounds? ");
        return in.nextDouble();
    }

    private static double time () {

        System.out.print("How many hours has it been since your last drink? ");
        return in.nextDouble();
    }

    public static void main(String[] args) {

        double r = 1;

        double gender = gender();

        double ounces = ounces();

        double weight = weight();

        double time = time();

        if (gender == 1 ){
            r = 0.73;
        }

        else{
            r = 0.66;
        }

        double bac = (ounces*5.14/weight*r)-0.015*time;

        System.out.println("Your BAC is "+String.format("%.6f",bac)+ ".");

        String output = (bac<0.08)? "It is legal for you to drive." : "It is not legal for you to drive.";

        System.out.println(output);
    }
}
