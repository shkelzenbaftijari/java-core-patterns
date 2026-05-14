package ex07_streamAPI;

import ex04_oop.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for Stream API exercises
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        StreamAPI api = new StreamAPI();

        // · CLASSIC FILTER vs STREAM FILTER ······················
        List<Robot> filtered = api.filterRobots(api.robots);
        System.out.println("--- Robots (version > 1) — classic ---");
        for (Robot r : filtered) System.out.println(r.getName() + " - Ver: " + r.getVersion());
        System.out.println();

        List<Robot> filteredStream = api.filterWithStream(api.robots);
        System.out.println("--- Robots (version > 1) — stream ---");
        for (Robot r : filteredStream) System.out.println(r.getName() + " - Ver: " + r.getVersion());
        System.out.println();

        // · MAP — transform to uppercase names ···················
        List<String> upperNames = api.getRobotNamesUppercase(api.robots);
        System.out.println("--- Robot names (uppercase) ---");
        for (String name : upperNames) System.out.println(name);
        System.out.println();

        // · FILTER + MAP — version 10 only ·······················
        List<String> version10 = api.filterCompare(api.robots);
        System.out.println("--- Robots (version == 10) ---");
        for (String name : version10) System.out.println(name);
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · STREAM API · Classic vs Stream pipeline comparisons
// ════════════════════════════════════════════════════════
class StreamAPI {

    List<Robot> robots = new ArrayList<>(Arrays.asList(
            new Robot("R2D2",    1),
            new Robot("C3PO",    2),
            new Robot("#R56",    3),
            new Robot("BB8",     4),
            new Robot("Wall-E",  1),
            new Robot("Eve",     5),
            new Robot("Optimus", 10),
            new Robot("Megatron",10),
            new Robot("Bender",  3),
            new Robot("Data",    7)
    ));

    // · 1. CLASSIC filter — for loop ··························
    List<Robot> filterRobots(List<Robot> allRobots) {
        List<Robot> result = new ArrayList<>();
        for (Robot r : allRobots) {
            if (r.getVersion() > 1) result.add(r);
        }
        return result;
    }

    // · 2. STREAM filter — filter() + collect() ···············
    public List<Robot> filterWithStream(List<Robot> allRobots) {
        return allRobots.stream()
                .filter(robot -> robot.getVersion() > 1)
                .collect(Collectors.toList());
    }

    // · 3. STREAM map() — Robot → String (uppercase name) ····
    public List<String> getRobotNamesUppercase(List<Robot> allRobots) {
        return allRobots.stream()
                .map(r -> r.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    // · 4. STREAM filter() + map() chained ····················
    public List<String> filterCompare(List<Robot> allRobots) {
        return allRobots.stream()
                .filter(robot -> robot.getVersion() == 10)
                .map(r -> r.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    // · 5. ADVANCED PIPELINE — filter, sort, map, collect ····
    public List<Robot> getAdvancedRobotList(List<Robot> allRobots) {
        return allRobots.stream()
                .filter(r -> r.getVersion() > 1)
                .sorted(Comparator.comparingInt(Robot::getVersion).reversed())
                .map(r -> new Robot(r.getName(), r.getVersion()))
                .collect(Collectors.toList());
    }

}
