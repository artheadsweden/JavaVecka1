package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String name = "";
         do {
            System.out.println("Enter a name. Exit with quit.");
            name = in.next();
            if(name.toLowerCase().equals("quit")) {
                break;
            }
            System.out.println("Hello " + name);
        } while(!name.toLowerCase().equals("quit"));
        System.out.println("You said quit");
    }
}
