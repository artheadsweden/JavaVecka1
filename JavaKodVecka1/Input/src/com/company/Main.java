package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("What is your name? ");
	    String name = input.next();

	    if(name.equals("Joakim")) {
            System.out.println("What a nice name...");
        }

        System.out.println("Hello " + name);
        System.out.print("How old are you? ");
        int age = input.nextInt();

        if(age == 18) {
            System.out.println("You can vote");
        }

        if(age >= 13  && age <= 19) {
            System.out.println("You are a teen");
        }
        else {
            System.out.println("You are not a teen");
        }
    }
}
