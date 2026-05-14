package ex01_if;

import java.util.Scanner;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for if/else exercises
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        int cookies = 5;
        if (cookies >= 3) {
            System.out.println("Time to share with friends!");
        } else {
            System.out.println("Not enough, need to buy more.");
        }

        Exercises s = new Exercises();

        // · 1. INVENTORY CHECK ···································
        s.checkInventory();

        // · 2. MODULO CHECK ······································
        s.checkModul();

        // · 3. TEMPERATURE ·······································
        System.out.println(s.checkTemperature(20));
        s.printTemperature(20);

        // · 4. ENTRANCE CONTROL ··································
        s.checkEntrance("Seni", 37);

        // · 5. CALCULATOR ········································
        Exercises obj = new Exercises();
        obj.startInfiniteCalculator();
    }
}

// ════════════════════════════════════════════════════════
// · EXERCISES · If/else exercise implementations
// ════════════════════════════════════════════════════════
class Exercises {

    // · 1. INVENTORY CHECK ···································
    int cookie = 2;
    void checkInventory() {
        if (cookie >= 3) {
            System.out.println("Time to share with friends!");
        } else {
            System.out.println("Not enough, need to buy more.");
        }
    }

    // · 2. MODULO — even or odd ······························
    public void checkModul() {
        int num = 15;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    // · 3. TEMPERATURE CHECK ·································
    public String checkTemperature(int a) {
        if (a > 30)       return "Very hot";
        else if (a > 13)  return "Nice spring weather";
        else              return "Dress warm, it's cold";
    }

    public void printTemperature(int a) {
        if (a > 30)       System.out.println("Very hot");
        else if (a > 13)  System.out.println("Nice spring weather");
        else              System.out.println("Dress warm, it's cold");
    }

    // · 4. ENTRANCE CONTROL — string .equals ·················
    public void checkEntrance(String name, int age) {
        if (name.equals("Seni") && age > 10) {
            System.out.println("Welcome to the Club!");
        } else {
            System.out.println("Access denied.");
        }
    }

    // · 5. INFINITE CALCULATOR — nested if + while ···········
    public void startInfiniteCalculator() {
        Scanner in = new Scanner(System.in);
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter a positive number: ");

            if (in.hasNextDouble()) {
                double number = in.nextDouble();

                if (number >= 0) {
                    System.out.println("Square root: " + Math.sqrt(number));
                    isValidInput = true;
                } else {
                    System.out.println("ERROR: Number must be positive. Try again.");
                }
            } else {
                System.out.println("ERROR: Invalid input. Numbers only.");
                in.next();
            }
        }
        System.out.println("Done.");
    }

}
