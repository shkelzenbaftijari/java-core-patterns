package ex04_oop;

// OOP concepts demonstrated in this module:
// 1. Classes & Objects      — blueprint and instance
// 2. Encapsulation          — private fields, getters/setters
// 3. Constructors           — object initialization
// 4. Composition (Has-A)    — Robot has a Battery
// 5. Inheritance (Is-A)     — FlyingRobot is a Robot
// 6. Polymorphism & Casting — one reference, many forms

// ════════════════════════════════════════════════════════
// · MAIN · OOP demo runner
// ════════════════════════════════════════════════════════
public class Main {
    static void main(String[] args) {

        // · 2. INSTANTIATING OBJECTS ·····························
        // After encapsulation, direct field access is blocked — use setters.
        Robot myRobot2 = new Robot("R45G", 1);
        System.out.println(myRobot2);
        System.out.println();

        Robot myRobot3 = new Robot();
        myRobot3.setName("S89#");
        myRobot3.setVersion(2);
        System.out.println(myRobot3);
        System.out.println();

        Robot myRobot4 = new Robot();
        myRobot4.setName("F79#");
        myRobot4.setVersion(5);
        System.out.println("myRobot4 - " + myRobot4);
        System.out.println();

        // · 4. COMPOSITION ·······································
        Battery b = new Battery();
        b.setPowerLevel(88);

        Robot myRobot5 = new Robot();
        myRobot5.setName("R2D2");
        myRobot5.setVersion(5);
        myRobot5.setBattery(b);
        System.out.print("Robot 5: " + myRobot5 + " - Battery Level: " + myRobot5.checkPower() + "%");
        System.out.println();

        // · 5. INHERITANCE ·······································
        FlyingRobot fr = new FlyingRobot();
        fr.setName("PlaneRobot");
        fr.setVersion(1);
        System.out.println("\nFly Robot: " + fr + " - Battery Level: " + fr.checkPower() + "%");
        fr.fly();
        System.out.println();

        // · 6. POLYMORPHISM — one object, many forms ·············
        Robot r1 = new Robot();
        r1.setName("Alpha");
        r1.setVersion(3);
        r1.getBattery().setPowerLevel(100);
        System.out.println("Robot r1: " + r1 + " battery - " + r1.checkPower() + "%");
        System.out.println();

        // Upcasting: FlyingRobot referenced as Robot
        Robot r2 = new FlyingRobot();
        r2.setName("Alpha-2");
        r2.setVersion(3);
        r2.getBattery().setPowerLevel(100);
        System.out.println("Robot r2: " + r2 + " battery - " + r2.checkPower() + "%");

        // Downcasting needed to call fly() — type is Robot, not FlyingRobot
        ((FlyingRobot) r2).fly();
        System.out.println();
    }
}
