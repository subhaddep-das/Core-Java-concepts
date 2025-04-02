package concepts;

import operators.TypeCasting;
import java.util.Scanner;

public class BasicConcepts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        TypeCasting typeCaster = new TypeCasting(); 

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Perform Type Casting Operations");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    typeCaster.performTypeCasting();
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
