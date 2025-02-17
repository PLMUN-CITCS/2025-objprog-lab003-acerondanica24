import java.util.Scanner; // Importing the Scanner class for input

public class InputOutputDemo {
    public static void main(String[] args) {
        
        // Create a Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt(); // Read the integer entered by the user
        
        // Prompt the user to enter a decimal number (double)
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble(); // Read the decimal number entered by the user
        
        // Consume the leftover newline character after reading a number
        input.nextLine(); // Consume the newline character
        
        // Prompt the user to enter a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine(); // Read the string entered by the user

        // Output the integer with formatting
        System.out.printf("Your integer: %d%n", userInt);

        // Output the decimal number with formatting to 2 decimal places
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output the string
        System.out.printf("Your string: %s%n", userString);

        // Close the Scanner object to release resources
        input.close();
    }
}
