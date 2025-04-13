package foreachdemo;

import java.util.*;

public class ForEachDemo {

    // Model class
    static class Employee {
        private final int id;
        private final String name;
        private final double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
        }
    }

    public static void runDemo() {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 55000),
                new Employee(102, "Bob", 48000),
                new Employee(103, "Charlie", 67000)
        );

        // Traditional loop (more verbose, manual indexing)
        System.out.println("-- Traditional for loop:");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.println(emp);
        }

        // For-each loop (cleaner)
        System.out.println("-- For-each loop:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\n=== 2. Avoiding IndexOutOfBoundException ===");

        try {
            System.out.println("-- Traditional loop with manual error:");
            for (int i = 0; i <= employees.size(); i++) { // Off-by-one bug!
                System.out.println(employees.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught error: " + e);
        }

        System.out.println("-- For-each loop (safe by design):");
        for (Employee emp : employees) {
            System.out.println(emp); // No risk of index error
        }

        System.out.println("\n=== 3. More readable Map iteration ===");

        Map<String, Integer> departmentHeadcount = Map.of(
                "HR", 5,
                "Engineering", 25,
                "Marketing", 10 
        );

        // Traditional loop
        System.out.println("-- Using keySet + get (less readable, less efficient):");
        for (String key : departmentHeadcount.keySet()) {
            System.out.println("Department: " + key + ", Employees: " + departmentHeadcount.get(key));
        }

        // For-each with entrySet
        System.out.println("-- Using entrySet (cleaner and faster):");
        for (Map.Entry<String, Integer> entry : departmentHeadcount.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Employees: " + entry.getValue());
        }

        System.out.println("\n=== 4. Simpler Set iteration ===");

        Set<String> tools = new HashSet<>(Arrays.asList("Git", "Maven", "Docker"));

        // Traditional loop using iterator (verbose)
        System.out.println("-- Using Iterator:");
        Iterator<String> iterator = tools.iterator();
        while (iterator.hasNext()) {
            System.out.println("Tool: " + iterator.next());
        }

        // For-each loop (simple)
        System.out.println("-- Using For-each loop:");
        for (String tool : tools) {
            System.out.println("Tool: " + tool);
        }
    }

}