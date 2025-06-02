package Basics;

import java.util.Scanner;

public class RightMostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int result = findRightMostDigitInASentence(input);

        if (result != -1) {
            System.out.println("Rightmost digit: " + result);
        } else {
            System.out.println("No digit found in the input sentence.");
        }
    }

    private static int findRightMostDigitInASentence(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }
}
