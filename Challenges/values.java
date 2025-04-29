package Challenges;
import java.util.Scanner;

public class values{
    public static void main(String[] args) {
        // Ask the user to enter three numbers
        try (Scanner sc = new Scanner(System.in)) {
            // Ask the user to enter three numbers
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            
            System.out.println("Enter third number:");
            int num3 = sc.nextInt();
            
            // Calculate sum and average
            int sum = num1 + num2 + num3;
            double average = sum / 3.0; // Divide by 3.0 to get a decimal average
            
            // Display the results
            System.out.println("You entered: " + num1 + ", " + num2 + ", " + num3);
            System.out.println("Sum of the numbers = " + sum);
            System.out.println("Average of the numbers = " + average);
        }
    }
}

    

