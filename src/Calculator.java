import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//        get input numbers from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();

//    what operation would you like to perform? (+, -, *, /, )
        System.out.println("what operation would you like to perform? (+, -, *, /, )");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("addition result: "+ (num1 + num2) );
                break;

            case '-':
                System.out.println("subtraction result is: "+ (num1 - num2 ));
                break;
            case '*':
                System.out.println("multiplication result is: "+ (num1 * num2 ));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("division result is: " + (num1 / num2));
                    break;}

                else{
                    System.out.println("error, please enter a valid number. ");
                    break;}

        }

    }}


