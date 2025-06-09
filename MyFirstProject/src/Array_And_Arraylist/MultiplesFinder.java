package Array_And_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class MultiplesFinder {

    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> result = new ArrayList<>();

        if (number <= 0 || limit <= 0) {
            return result;
        }

        for (int i = number; i < limit; i += number) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        MultiplesFinder mf = new MultiplesFinder();

        List<Integer> multiples = mf.determineMultiples(5, 30);
        System.out.println("Multiples of 5 less than 30: " + multiples);

        List<Integer> testCase2 = mf.determineMultiples(-2, 10);
        System.out.println("Negative number case: " + testCase2);
    }
}
