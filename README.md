# java-core-patterns

Java fundamentals practiced through real-world patterns — the same building blocks used daily
in Spring Boot development: service layers, DTO mapping, repository abstraction, and Stream pipelines.

---

## Modules

| Module | Concepts |
|---|---|
| `ex01_if` | Conditionals, nested logic, Scanner input validation |
| `ex02_for` | for, while, for-each, char iteration, accumulators |
| `ex03_methods` | void/return methods, method collaboration, type conversion |
| `ex04_oop` | Encapsulation, constructors, composition (Has-A), inheritance (Is-A), polymorphism |
| `ex05_collections` | ArrayList, List interface, Set, Map — iteration patterns |
| `ex06_dto` | DTO pattern, MappingService, entity ↔ DTO conversion |
| `ex07_streamAPI` | filter(), map(), sorted(), collect() — classic vs stream comparison |
| `ex_invoice_app` | **Mini CRUD app** — Service, Repository, Entity, DTO wired together without a framework |

---

## Why these patterns matter

These are not just exercises — they are the exact structures used in production Spring Boot applications:

- **Service layer** separates business logic from data access — same as `@Service` in Spring
- **Repository Mock** simulates a database layer — same contract as `JpaRepository`
- **DTO pattern** controls what data is exposed to the outside — same as response DTOs in REST APIs
- **MappingService** converts between layers — same responsibility as MapStruct or manual mappers
- **Stream API** replaces verbose for-loops — standard in any modern Java codebase

The invoice mini-app connects all of these: one domain object, four layers, zero framework.

---

## How to run

Open in IntelliJ IDEA (or any Java IDE).
Each module has a `Solution.java` or `Main.java` as the entry point.
No dependencies — pure Java, no build tool required.
