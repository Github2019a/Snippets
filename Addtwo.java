import java.util.Scanner;
import java.util.Date;

public class Addtwo {
    public static void main(String[] args) {
        
             
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number (less than 100): ");
        int num1 = scanner.nextInt();

        // Check if the first number is less than 100
        if (num1 >= 100) {
            System.out.println("Please enter a number less than 100.");
            return; // Exit the program if the number is 100 or greater
        }

        System.out.print("Enter the second number (less than 100): ");
        int num2 = scanner.nextInt();

        // Check if the second number is less than 100
        if (num2 >= 100) {
            System.out.println("Please enter a number less than 100.");
            return; // Exit the program if the number is 100 or greater
        }

        // Add the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	System.out.print("Hello, today is: ");
        System.out.println(new Date());
        
        // Close the scanner
        scanner.close();

    }
}
