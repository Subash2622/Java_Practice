package Array_And_Arraylist;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Subash", 35, 45, 78, 72, 67);
        Student student1 = new Student("Abhisek", 99, 99, 99, 93, 99, 92, 99);
        Student student2 = new Student("Amit", 99, 58, 78, 92);

        student.addNewMark(35);
        System.out.println("Updated marks for " + student.getName() + ": " + student);

        printStudentReport(student);
        printStudentReport(student1);
        printStudentReport(student2);
    }

    public static void printStudentReport(Student student) {
        System.out.println("----- Report for " + student.getName() + " -----");
        System.out.println("Number of marks: " + student.getNumberOfMarks());
        System.out.println("Total marks: " + student.getTotalSumOfMarks());
        System.out.println("Maximum mark: " + student.getMaximumMark());
        System.out.println("Minimum mark: " + student.getMinimumMark());
        System.out.println("Average marks: " + student.getAverageMarks());
        System.out.println();
    }
}
