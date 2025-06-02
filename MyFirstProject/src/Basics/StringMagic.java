package Basics;

import java.util.Scanner;

public class StringMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        StringMagic stringMagic = new StringMagic();
        int uppercaseCount = stringMagic.countUppercaseLetters(input);

        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }
    public int countUppercaseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count;
    }
}
