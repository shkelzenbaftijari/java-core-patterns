package ex05_collections;

import java.util.*;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for collections exercises
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        Collection myDemo = new Collection();

        // · ArrayList ············································
        myDemo.demoList();
        System.out.println();

        // · List<String> interface ·······························
        myDemo.demoList2();
        System.out.println();

        // · Object list ··········································
        Collection2 r = new Collection2();
        r.printRobots();
        System.out.println();

        // · Set ··················································
        Collection s = new Collection();
        s.demoSet();
        System.out.println();

        // · Map ··················································
        Collection m = new Collection();
        m.demoMap();
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · COLLECTION · List, Set, Map demos
// ════════════════════════════════════════════════════════
class Collection {

    // · 1. LIST — ArrayList<String> is a Class ················
    ArrayList<String> robotNames = new ArrayList<>();
    public void demoList() {
        robotNames.add("R32");
        robotNames.add("G55");
        robotNames.add("166F");

        for (String name : robotNames) {
            System.out.println("Robots1: " + name);
        }
    }

    // · 2. LIST — List<String> is an Interface (market-ready) ·
    List<String> robotNames2 = new ArrayList<>(Arrays.asList("R2D2", "C3PO", "BB8"));
    public void demoList2() {
        for (String robot : robotNames2) {
            System.out.println("Robots2: " + robot);
        }
    }

    // · 3. SET — ignores duplicates ···························
    public void demoSet() {
        Set<String> robotSet = new HashSet<>();
        robotSet.add("ABC");
        robotSet.add("DEF");
        robotSet.add("ABC"); // duplicate — ignored by Set
        robotSet.add("AAA");

        System.out.println("Set size: " + robotSet.size());
        for (String item : robotSet) {
            System.out.println("Robot in Set: " + item);
        }
    }

    // · 4. MAP — key/value pairs ······························
    public void demoMap() {
        Map<String, Integer> robotCatalog = new HashMap<>();
        robotCatalog.put("R2D2", 1);
        robotCatalog.put("C3PO", 2);
        robotCatalog.put("BB8", 3);

        // Map requires entrySet() to iterate
        for (Map.Entry<String, Integer> entry : robotCatalog.entrySet()) {
            System.out.println("Robot: " + entry.getKey() + " | Version: " + entry.getValue());
        }
    }

}

// ════════════════════════════════════════════════════════
// · COLLECTION 2 · List of objects demo
// ════════════════════════════════════════════════════════
class Collection2 {

    public void printRobots() {
        List<String> robots = new ArrayList<>(Arrays.asList("AAA", "BBB", "CCC", "DDD"));
        System.out.print("Robots: ");
        for (String name : robots) {
            System.out.print(name + " ");
        }
    }

}
