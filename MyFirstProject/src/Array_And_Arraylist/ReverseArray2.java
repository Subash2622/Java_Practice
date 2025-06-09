package Array_And_Arraylist;

public class ReverseArray2 {
    public int[] reverseArray(int[] array){
        if(array.length<1){
            return array;
        }
        int start =0;
        int end = array.length-1;

        int [] reversedArray = new int[array.length];

        while(start<end){
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }
        return reversedArray;
    }
    public static void main(String[] args) {
        ReverseArray2 ra = new ReverseArray2();
        int[] input = {1, 2, 3, 4, 5};

        int[] result = ra.reverseArray(input);

        System.out.print("Reversed array: ");
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
