package OOPS.Inheritance;

public class StudentRunner {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Subash");
//        student.setEmail("test@gmail.com");
//
//        System.out.println(student);

//        Person person = new Person();
//        String value = person.toString();
//        System.out.println(value);
//        System.out.println(person);
        Employee employee = new Employee();
//        employee.setName("Subash Sahoo");
        employee.setEmail("test@gmail.com");
        employee.setEmployerGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}
