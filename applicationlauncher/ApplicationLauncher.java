package applicationlauncher;

import java.util.Scanner;

import foreachdemo.ForEachDemo; 
import typecastingdemo.TypeCastingDemo;

public class ApplicationLauncher { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        TypeCastingDemo typeCaster = new TypeCastingDemo(); 

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Type Casting Demo");
            System.out.println("2. ForEach Loop Demo");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    typeCaster.performTypeCasting();
                    break;
                case 2:
                	ForEachDemo.runDemo();
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
