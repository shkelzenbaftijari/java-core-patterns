package exercise_random;

public class Main {
    static void main(String[] args) {

        Exercise p1 = new Exercise();
        p1.setName("John").setSurname("Doe").setAge(37);
        System.out.println("Person: " + p1 + " — " + p1.checkAdult(p1.getAge()));
        System.out.println();

        Exercise p2 = new Exercise();
        p2.setName("Emma").setSurname("Smith").setAge(6);
        System.out.println("Person: " + p2 + " — " + p2.checkAdult(p2.getAge()));
        System.out.println();
    }
}
