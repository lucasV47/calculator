import java.util.Scanner;

public class Calculator {

    static double num1;
    static double num2;
    static char operator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;
//estrutura da execuçao
        while (continueCalculation){
            System.out.println("Please enter 2 numbers.");

            num1= getNumber(sc, "Enter the first number.");
            num2= getNumber(sc, "Enter the second number");
            // operator gets input sc passing method
            operator= getOperator(sc);
            // operation is performed calling num1.2 ope.
            performCalculation(num1, num2, operator);
            // continue or exit program?
            System.out.println("Would you like to perform another calculation? (y/n)");
            String response = sc.next();
            continueCalculation = response.equalsIgnoreCase("y");
        }
        sc.close();
        System.out.println("Calculator closed.");
    }

    private static double getNumber (Scanner sc, String prompt) {
        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            if (sc.hasNextDouble()){
                number = sc.nextDouble();
                validInput = true; // valid input
            }else{
                System.out.println("Invalid input, please enter a number.");
                sc.next(); // clears input stream
            }
        }
        return number;
    }
    private static char getOperator(Scanner sc){
        char op =' ';
        boolean validInput= false;

        while (!validInput){
          System.out.println("what operation would you like to perform? (+, -, *, /): ");
          op = sc.next().charAt(0);
          if ("-+*/".indexOf(op) != -1){
              validInput= true; // validated input
          }else {
              System.out.println("Invalid operator. Please enter one of (+, -, *, /): ");
          }
        }
        return  op;
    }
    private static void performCalculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Your addition result is : "+ (num1+num2));
                break;
            case '-':
                System.out.println("Your subtraction result is : " + (num1-num2));
                break;
            case '*':
                System.out.println("Your multiplication result is : " + (num1*num2));
                break;
            case '/':
                if (num2 != 0){
                    System.out.println("Your division result is : " + (num1/num2));
                }else{
                    System.out.println("Error: division by 0 not allowed.");
                }
                break;
        }
    }
}

