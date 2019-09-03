package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int value = in.nextInt();


        switch (value) {
            case 1:
                System.out.println("You picked 1");
                break;
            case 2:
                System.out.println("You picked 2");
                break;
            case 3:
                System.out.println("You picked 3");
                break;
            default:
                System.out.println("You did not enter 1, 2 or 3");
                break;
        }
    }


}
