package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Kalle";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        if(name.toLowerCase().equals("kalle")) {
            System.out.println("Kalle, kul " + name.toLowerCase().replace('a', 'i'));
        }
        System.out.println(name);
        name = name.replace('l', 'i');
        System.out.println(name);
    }
}
