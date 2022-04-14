package main;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        if (name.endsWith("a")|| name.endsWith("A")) {
            System.out.println("Jesteś kobietą");
        }else if (name.endsWith("k")) {
            System.out.println("Twoje imię kończy sie na k");

        } else  {
            System.out.println("Jesteś mężczyzną");
        }

    }
}
