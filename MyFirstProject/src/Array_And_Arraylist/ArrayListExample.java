package Array_And_Arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();

        ArrayList<String> degree = new ArrayList<>();

        names.add("Subash");
        names.add(100);
        names.add(true);
        names.add(55.5);
        names.add('A');

        for (Object name : names) {
            System.out.println(name);
        }
        degree.add("BE");
        degree.add("BSC");
        degree.add("BA");
        degree.add("CS");

        System.out.println(degree);
        for (String deg : degree) {
            System.out.println(deg);
        }
    }
}
