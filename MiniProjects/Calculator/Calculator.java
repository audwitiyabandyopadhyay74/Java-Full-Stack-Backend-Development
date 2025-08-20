package MiniProjects.Calculator;

import java.util.Scanner;

public class Calculator {
    /**
     * This method performs the calculation based on the operation number provided.
     * 
     * @param number1         First integer number
     * @param number2         Second integer number
     * @param operationNumber Operation to perform (1=Add, 2=Subtract, 3=Multiply,
     *                        4=Divide, 5=Remainder)
     */
    static void calculation(int number1, int number2, int operationNumber) {
        switch (operationNumber) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 % number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
    }

    /**
     * Main method to run the calculator program. It takes user input for two
     * numbers and the operation to perform.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Made using Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int secondNumber = sc.nextInt();
        System.out.println(
                "Select and type the operation number:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder");
        int operationNumber = sc.nextInt();
        calculation(firstNumber, secondNumber, operationNumber);
        sc.close();
    }
}
