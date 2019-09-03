package com.company;

public class Main {

    public static void main(String[] args) {
        // Deklaration
        int number = 23;
        number = 14;
        System.out.println(number);

        int x = 10;
        int y = number + x;
        System.out.println(y);

        byte b = 100;
        System.out.println(b);

        b = (byte)(b + 1);
        b += 1;
        b++;
        System.out.println(b);

        b = 127;
        b++;
        System.out.println(b);

        int i = 100;
        i = i + 1;
        i += 1;
        i++;
        System.out.println(i % 2);
        i++;
        System.out.println(i % 2);

        float f = 10.4f;
        System.out.println(f);

        double d = 10.56;
        System.out.println(d);

        char c = 'B';
        System.out.println(c);
        c++;
        System.out.println(c);

        boolean done = false;
        System.out.println(done);
        done = true;
        System.out.println(done);

        String name = "Johanna";
        System.out.println(name);
        name = name + "!";
        System.out.println(name);
        name += "Tjoho";
        System.out.println(name);
    }
}
