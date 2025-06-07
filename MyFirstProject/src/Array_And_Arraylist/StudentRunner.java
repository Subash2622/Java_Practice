package Array_And_Arraylist;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int [] marks = {99,58,78,92,72};
        Student student = new Student("Subash",marks);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks "+number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Total Mark "+sum);

        int maximuMark = student.getMaximumMark();
        System.out.println("Maximum of marks: "+maximuMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum of marks: "+minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average mark: "+ average);
    }
}
