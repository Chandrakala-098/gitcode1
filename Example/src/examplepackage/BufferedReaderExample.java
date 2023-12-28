package examplepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) {
        // Creating a BufferedReader object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading a line of text from the user
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Displaying the entered input
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            try {
                // Closing the BufferedReader
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

