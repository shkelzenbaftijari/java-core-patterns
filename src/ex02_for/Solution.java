package ex02_for;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for loop exercises
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        Simple obj = new Simple();

        // · 1. ROCKET COUNTDOWN ··································
        obj.launchRocket();
        System.out.println();

        // · 2. COOKIE COUNTER ····································
        obj.eatCookies();
        System.out.println();

        // · 3. MONEY SAVER ·······································
        obj.saveMoney();
        System.out.println();

        // · 4. ALPHABET SHOUTER ··································
        obj.printAlphabet();
        System.out.println();

        // · 5. LETTER FINDER ·····································
        obj.countLetterA();
        System.out.println();

        // · 6. GROCERY LIST (for-each) ···························
        obj.printGroceries();
        System.out.println();

        // · 7. MULTIPLICATION GRID ·······························
        obj.multiplicationTable();
        System.out.println();

        // · 8. WORD FLIPPER ······································
        obj.flipWord("Seni");
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · SIMPLE · Loop exercise implementations
// ════════════════════════════════════════════════════════
class Simple {

    // · 1. ROCKET COUNTDOWN — for (descending) ···············
    public void launchRocket() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Blastoff!");
    }

    // · 2. COOKIE COUNTER — while ····························
    int i = 1;
    public void eatCookies() {
        while (i <= 5) {
            System.out.println("Eating cookie #" + i);
            i++;
        }
    }

    // · 3. MONEY SAVER — accumulator pattern ·················
    public void saveMoney() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + i;
        }
        System.out.println("After 10 days, total saved: " + total + "€");
    }

    // · 4. ALPHABET SHOUTER — char loop ······················
    public void printAlphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // · 5. LETTER FINDER — char comparison ···················
    public void countLetterA() {
        String word = "Ananas";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'A') count++;
        }
        System.out.println("In \"" + word + "\", letter 'a' appears " + count + " times.");
    }

    // · 6. GROCERY LIST — for-each ···························
    public void printGroceries() {
        String[] foods = {"Apple", "Banana", "Cherry", "Donut"};
        for (String f : foods) {
            System.out.println("Buying today: " + f);
        }
    }

    // · 7. MULTIPLICATION GRID — nested for ··················
    public void multiplicationTable() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    // · 8. WORD FLIPPER — reverse iteration ··················
    public void flipWord(String word) {
        System.out.print("Reversed \"" + word + "\": ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

}
