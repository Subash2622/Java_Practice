package Array_And_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfANumber {
    public List<Integer> determineAllFactor(int number){
        List<Integer> facors = new ArrayList<>();
        if (number < 0){
            return new ArrayList<>();
        }
        for (int i=1;i<=number;i++){
            if(number%i==0){
                facors.add(i);
            }
        }
        return facors;
    }
    public static void main(String[] args) {
        ReverseArray2 ra = new ReverseArray2();

        int[] input = {1, 2, 3, 4, 5};
        int[] result = ra.reverseArray(input);

        System.out.print("Reversed array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
