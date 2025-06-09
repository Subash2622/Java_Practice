package Array_And_Arraylist;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private final String name;
    private final int[] marks;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int maxNumber = Integer.MIN_VALUE;
        for(int mark : marks){
            if(mark>maxNumber){
                maxNumber = mark;
            }
        }
        return maxNumber;
    }

    public int getMinimumMark(){
        int minNumber = Integer.MAX_VALUE;
        for(int mark : marks){
            if(mark<minNumber){
                minNumber = mark;
            }
        }
        return minNumber;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
    }
    @Override
    public String toString() {
        return name;
    }
}
