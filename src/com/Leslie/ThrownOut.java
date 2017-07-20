package com.Leslie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrownOut {

    public static void main(String[] args) {


        String[] names = {"Bo", "Flo", "Mo", "Schmo", "Jo", "Kay", "Faye", "Jack", "Mack", "Mary", "Barry",
                "Larry", "Ike", "Spike", "Gary", "Jim", "Kim", "Cary", "Lee", "Cara"};
        String[] hometowns = {"Seattle", "Bangkok", "Flint", "Helsinki", "Paris", "Berlin", "Lagos", "Kingston", "Gary",
                "Ottawa", "Duluth", "Hell", "Tunis", "London", "Perth", "Madrid", "Reno", "Tokyo", "Shanghai", "Seoul"};
        String[] favFoods = {"tacos", "chili", "pizza", "chips", "nachos", "phad thai", "pancakes", "cheese", "brownies", "cake",
                "lamb chops", "avocado", "fish", "shrimp", "lobster", "bananas", "milk", "fudge", "salad", "apples"};

        boolean test1 = false;
        boolean test2 = false;


        System.out.println("Welcome to our Java class!");


        do {
            try {
                System.out.println("Which student would you like to learn more about? \n Enter a number 1-20");
                Scanner scan = new Scanner(System.in);
                int studentNum = scan.nextInt();


            } catch (InputMismatchException e) {

                System.out.println("That student does not exist.Please try again.( enter a number 1-20)");
            }


        } while (test1 = false);
    }
}

