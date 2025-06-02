package Basics;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = sc.nextInt();
        // System.out.println("The nuber you entered is - "+ number1);

        System.out.print("Enter Number2: ");
        int number2 = sc.nextInt();

        System.out.println("Choices Available are ");
        System.out.println("1 - Add ");
        System.out.println("2 - Subtract ");
        System.out.println("3 - Multiply ");
        System.out.println("4 - Divide ");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.println("Your choices are ");
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
        System.out.println("Choice " + choice);

//        performOperationUsingNestedIfElse(choice, number1, number2);
        performOperationUsingSwitch(choice, number1, number2);
    }

    private static void performOperationUsingNestedIfElse(int choice, int number1, int number2) {
        if (choice == 1) {
            System.out.println("Result = " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result = " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result = " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("Result = " + (number1 / number2));
        } else {
            System.out.println("Not a valid operation");
        }
    }

    private static void performOperationUsingSwitch(int choice, int number1, int number2) {
        switch (choice) {
            case 1:
                System.out.println("Result = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result = " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result = " + (number1 / number2));
                break;
            default:
                System.out.println("Not a valid operation");
                break;
        }

    }

}
