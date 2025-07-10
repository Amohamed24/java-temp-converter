//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Hello! What's your name?: ");
        String name = scanner.nextLine();
        System.out.println("**********************");
        System.out.println("Hi " + name + "! I can convert any temperature to Celsius or Fahrenheit");

        while(true) {
            System.out.println("**********************");
            System.out.println("Enter a temperature? :");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing " + name);
                break;
            }

            double temp;
            try {
                temp = Double.parseDouble(input);
            } catch (NumberFormatException var10) {
                System.out.println("Please enter a valid number");
                continue;
            }

            System.out.println("Select: 1) Convert to Celsius or 2) Convert to Fahrenheit (or type 'q' to quit):");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing " + name);
                break;
            }

            int choice;
            try {
                choice = Integer.parseInt(input2);
            } catch (NumberFormatException var9) {
                System.out.println("Invalid selection. Please enter 1 or 2.");
                continue;
            }

            switch (choice) {
                case 1:
                    double celsius = (temp - (double)32.0F) * (double)5.0F / (double)9.0F;
                    System.out.printf("Result: %.2f°F = %.2f°C%n", temp, celsius);
                    break;
                case 2:
                    double fahrenheit = temp * (double)9.0F / (double)5.0F + (double)32.0F;
                    System.out.printf("Result: %.2f°C = %.2f°F%n", temp, fahrenheit);
                    break;
                default:
                    System.out.println("Invalid! Please choose either 1 or 2");
            }
        }

        scanner.close();
    }

    static {
        scanner = new Scanner(System.in);
    }
}
