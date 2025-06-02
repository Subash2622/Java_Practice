package Basics;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);
    }
    public static int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
