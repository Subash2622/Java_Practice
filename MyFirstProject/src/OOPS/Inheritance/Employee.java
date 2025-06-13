package OOPS.Inheritance;


import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employerName;
    private char employerGrade;
    private BigDecimal Salary;

    public Employee(){
        super();
        System.out.println("Employee Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(char employerGrade) {
        this.employerGrade = employerGrade;
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }

    public String toString(){
        return super.toString() + title + "#" + employerName + "#" + employerGrade;
    }
}
