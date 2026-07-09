// import java.util.Scanner;

// public class nocheck {
    


//     public static void main(String[] args) {
//         int num ;
        
        
//         System.out.println("Enter a number");
//         Scanner cin = new Scanner(System.in);
//         num = cin.nextInt();

//         String result = (num % 2 == 0 && num > 0 && (num % 5 == 0 || num % 11 == 0))
//             ? "The result is positive"
//             : "The result is negative";

//             System.out.println("The result is: " + result);

        
        
// }  }


import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // 1. Check if the number is both positive AND even
        boolean isPositiveAndEven = (number > 0) && (number % 2 == 0);
        
        // 2. Check if the number is divisible by 5 OR divisible by 11
        boolean isDivisibleBy5Or11 = (number % 5 == 0) || (number % 11 == 0);
        
        // 3. Ternary operator to check if the number is "Positive" or "Negative/Zero"
        String signResult = (number >= 0) ? "Positive" : "Negative";
        
        // Displaying the results
        System.out.println("\n--- Results ---");
        System.out.println("Is the number positive and even? " + isPositiveAndEven);
        System.out.println("Is the number divisible by 5 or 11? " + isDivisibleBy5Or11);
        System.out.println("The number is: " + signResult);
        
        // Demonstrating the logical NOT (!) operator for extra completeness
        if (!isPositiveAndEven) {
            System.out.println("Note: The number is NOT a positive even number.");
        }
        
        scanner.close();
    }
}
