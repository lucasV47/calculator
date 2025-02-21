import java.util.Scanner;

public class Calculator {

    static double num1;
    static double num2;
    static char operator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            // get input numbers from user
            System.out.println("Enter 2 numbers:");
            while (true) {
                if (sc.hasNextDouble()) {
                    num1 = sc.nextDouble();
                    if (sc.hasNextDouble()) {
                        num2 = sc.nextDouble();
                        break; // exit loop if both numbers are valid
                    } else {
                        System.out.println("Please enter a valid second number.");
                        sc.next(); // clear the invalid input
                    }
                } else {
                    System.out.println("Please enter a valid first number.");
                    sc.next(); // clear the invalid input
                }
            }
            // What operation to perform
            System.out.println("What operation would you like to perform? (+, -, *, /)");
            while (true) {
                operator = sc.next().charAt(0);
                switch (operator) {
                    case '+':
                        System.out.println("Addition result: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Subtraction result: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("Multiplication result: " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println("Division result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please enter one of (+, -, *, /):");
                        continue; // ask for operator again
                }
                break; // exit the operator loop if a valid operator was processed
            }

            // ask if the user wants to perform another calculation
            System.out.println("Would you like to make another calculation? (y/n)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("y")) {
                continueCalculating = false;
            }
        }

        sc.close(); // close the scanner
        System.out.println("Calculator closed.");
    }
}
