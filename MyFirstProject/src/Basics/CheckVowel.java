package Basics;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one letter-> ");
        char ch = sc.next().charAt(0);
//        System.out.println(isVowel('a'));
        if(isVowel(ch)){
            System.out.println(ch + " is a vowel.");
        }else{
            System.out.println(ch + " is not a vowel");
        }
    }
    private static boolean isVowel(char ch){
        switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U': return true;
            default: return false;
        }
    }
}
