package Array_And_Arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        int [] marks1 = new int[5];
        boolean [] result = new boolean[3];
        System.out.println(Arrays.toString(marks1));
        System.out.println(Arrays.toString(result));
        System.out.println(marks.length);
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(marks));
        System.out.println("_________________________");
        for(int mark : marks){
            System.out.print(mark + " ");
            System.out.println("+++++++++++++++++++++");
        }
        String name [] = new String[5];
        Arrays.fill(name,"Subash");
        System.out.println(Arrays.toString(name));

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {6,5,4,3,2,1};

        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.equals(array1,array3));
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
