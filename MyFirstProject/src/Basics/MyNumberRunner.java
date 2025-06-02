package Basics;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(6);

        boolean isPrime = number.isPrime();
        System.out.println("isPrime "+isPrime);

        int sum = number.sumUptoN();
        System.out.println("Sum "+ sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors "+ sumOfDivisors);

        number.printNumberTriangle();
    }
}
