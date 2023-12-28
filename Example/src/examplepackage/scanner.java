package examplepackage;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Reading a line of text from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying the entered input
        System.out.println("Hello, " + name + "!");

        // Closing the Scanner (optional, as it doesn't throw IOException)
        scanner.close();
    }
}

