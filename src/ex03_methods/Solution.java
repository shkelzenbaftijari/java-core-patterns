package ex03_methods;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for methods exercises
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        BasicMethods obj = new BasicMethods();

        // · 1. GREETING ··········································
        obj.greetings();
        System.out.println();

        // · 2. GIFT SENDER ·······································
        obj.giveGift("SimFive");
        System.out.println();

        // · 3–7. MATH OPERATIONS ·································
        System.out.println(obj.addition(3, 2));
        System.out.println(obj.multiplication(2, 3.5));
        System.out.println(obj.checkNum(-2));
        System.out.println(obj.sqrtOf(9));
        System.out.println(obj.calculatePower(2, 3));
        System.out.println();

        // · 8. METHOD COLLABORATION ······························
        obj.processCalculation(5, 10);
        System.out.println();

        // · 9. TEMPERATURE CONVERTER ·····························
        System.out.println(obj.tempConverter(40, 'f'));
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · BASIC METHODS · Reusable method examples (magic box)
// ════════════════════════════════════════════════════════
class BasicMethods {

    // · 1. Print a greeting message.
    public void greetings() {
        System.out.println("Hello from JAVA");
    }

    // · 2. Send a gift to someone by name.
    public void giveGift(String name) {
        System.out.println("Gift is going to: " + name);
    }

    // · 3. Return the sum of two integers.
    public int addition(int a, int b) {
        return a + b;
    }

    // · 4. Return the product of two doubles.
    public double multiplication(double a, double b) {
        return a * b;
    }

    // · 5. Return true if the number is positive.
    public boolean checkNum(double num) {
        return num > 0;
    }

    // · 6. Return the square root of a number.
    public double sqrtOf(double num) {
        System.out.print("Square root of " + num + " = ");
        return Math.sqrt(num);
    }

    // · 7. Return base raised to the power of exponent.
    public double calculatePower(double base, double exponent) {
        System.out.print(base + "^" + exponent + " = ");
        return Math.pow(base, exponent);
    }

    // · 8. METHOD COLLABORATION — one method calls others ····
    // One method calls others — that's how real programs are built.
    public void processCalculation(int a, int b) {
        int sum = addition(a, b);
        System.out.println("Processing... result of addition: " + sum);
    }

    // · 9. Convert temperature to Fahrenheit (f) or Celsius (c).
    public double tempConverter(double value, char targetUnit) {
        if (targetUnit == 'F' || targetUnit == 'f') {
            return (value * 1.8) + 32;
        } else if (targetUnit == 'C' || targetUnit == 'c') {
            return (value - 32) / 1.8;
        } else {
            System.out.println("Unknown unit: " + targetUnit);
            return 0.0;
        }
    }

}
