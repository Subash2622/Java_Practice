package Basics;

import java.util.Scanner;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for consecutive duplicates:");
        String input = sc.nextLine();

        ConsecutiveDuplicates cd = new ConsecutiveDuplicates();
        boolean result = cd.hasConsecutiveLetters(input);

        System.out.println("Has consecutive duplicates? " + result);
    }

    public boolean hasConsecutiveLetters(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
