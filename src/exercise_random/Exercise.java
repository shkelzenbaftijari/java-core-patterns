package exercise_random;

// ════════════════════════════════════════════════════════
// · EXERCISE · Basic OOP model with fluent setters
// ════════════════════════════════════════════════════════
public class Exercise {

    private String name;
    private String surname;
    private int age;

    public String checkAdult(int age) {
        if (age >= 18) return "is Adult";
        else           return "is not Adult";
    }

    public String getName() { return name; }
    public Exercise setName(String name) { this.name = name; return this; }

    public String getSurname() { return surname; }
    public Exercise setSurname(String surname) { this.surname = surname; return this; }

    public int getAge() { return age; }
    public Exercise setAge(int age) { this.age = age; return this; }

    @Override
    public String toString() {
        return "Name=" + name + ", Surname=" + surname + ", Age=" + age;
    }

}
