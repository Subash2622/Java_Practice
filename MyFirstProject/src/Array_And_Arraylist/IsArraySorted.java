package Array_And_Arraylist;

public class IsArraySorted {
    public boolean isSorted(int[] array){
        if(array.length <= 1){
            return true;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i +1 ]<array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsArraySorted checker = new IsArraySorted();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 2, 1};

        System.out.println("Array 1 sorted: " + checker.isSorted(arr1));
        System.out.println("Array 2 sorted: " + checker.isSorted(arr2));
    }
}
