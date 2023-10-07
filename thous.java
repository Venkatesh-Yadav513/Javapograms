import java.text.NumberFormat;
import java.util.Scanner;

class ThousandSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        
        try {
            // Parse the user input as a number
            long number = Long.parseLong(userInput);
            
            // Format the number with thousand separator
            String formattedNumber = NumberFormat.getInstance().format(number);
            System.out.println("Formatted number with thousand separator: " + formattedNumber);
        } catch (NumberFormatException e) {
            // If input is not a valid number
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
