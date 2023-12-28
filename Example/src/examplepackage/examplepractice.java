package examplepackage;

import java.util.Scanner;

public class examplepractice {
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input as an integer
        int number = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Check if the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    // Function to check if a number is even
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
*/
/*		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input as an integer
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
*/
	/*        // Initial values
	        int num1 = 10;
	        int num2 = 20;

	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the numbers using a temporary variable
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        System.out.println("\nAfter swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	    }
	}*/
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}


