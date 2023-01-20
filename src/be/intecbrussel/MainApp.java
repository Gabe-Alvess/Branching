package be.intecbrussel;

import java.lang.reflect.Array;

public class MainApp {
    public static void main(String[] args) {
        // boolean hasSubscription = false;
        //
        // if (hasSubscription == true) {
        // System.out.println("Show article");
        // } else {
        // System.out.println("Show subscription banner");
        // }

        String name = "Gabriel";
        String language = "NL";

        if (language.equals("NL")) {
            System.out.println("Goedendag " + name);
        } else if (language.equals("DE")) {
            System.out.println("Guter tag " + name);
        } else if (language.equals("FR")) {
            System.out.println("Bonjour " + name);
        } else {
            System.out.println("Good morning " + name);
        }

        System.out.println("---- Oefening 1 ----");
        int a = 10;
        int b = 10;

        if (a == b) {
            System.out.println("De getallen zijn gelijk : " + a + " = " + b);
        } else {
            System.out.println("De getallen zijn niet gelijk : " + a + " != " + b);
        }

        System.out.println("---- Oefening 2 ----");
        int number = 11;

        if (number % 2 == 0) {
            System.out.println(number + " is een even getal.");
        } else {
            System.out.println(number + " is een oneven getal.");
        }

        System.out.println("---- SWITCH ----");

        language = "AR";

        switch (language) {
            case "NL":
                System.out.println("Goedendag " + name);
                break;
            case "DE":
                System.out.println("Guter tag " + name);
                break;
            case "FR":
                System.out.println("Bojour " + name);
                break;
            case "PT":
                System.out.println("Bom dia " + name);
                break;
            default:
                System.out.println("Good morning " + name);
        }

        int day = 6;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("---- complex statements ----");

        name = "Jan";
        language = "FR";
        int time = 19;

        if (language.equals("NL") && time < 12) {
            System.out.println("Goedemorgen, " + name);

        } else if (language.equals("Nl") && time >= 10 && time < 18) {
            System.out.println("Goedemiddag, " + name);

        } else if (language.equals("NL") && time >= 18 && time <= 24) {
            System.out.println("Goede avond, " + name);
        }

        // Nested if

        if (language.equals("NL")) {
            if (time < 12) {
                System.out.println("Goedemorgen, " + name);
            } else if (time >= 12 && time < 18) {
                System.out.println("Goedemiddag, " + name);
            } else if (time >= 18 && time <= 24) {
                System.out.println("Goede avond, " + name);
            }
        } else if (language.equals("FR")) {
            if (time < 12) {
                System.out.println("Bonjour, " + name);
            } else if (time >= 12 && time < 18) {
                System.out.println("Bon après midi, " + name);
            } else if (time >= 18 && time <= 24) {
                System.out.println("Bonsoir, " + name);
            }

        }

        // ternary operator -> minder belangrijk
        int age = 17;

        // normale if
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }

        // ternary operator -> (?) = if (:) = else
        System.out.println((age > 18) ? "Adult" : "Child");
    }
}
