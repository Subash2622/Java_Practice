package Array_And_Arraylist;

public class ArrayMagic {
    public boolean doesHaveElementGreaterThan(int[] array,int number){
        if(array.length == 0){
            return false;
        }
        for(int value:array){
            if(value > number){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayMagic im = new ArrayMagic();

        int[] array1 = {3, 7, 9, 2};
        int[] array2 = {1, 2, 3};

        int numberToCheck = 5;

        boolean result1 = im.doesHaveElementGreaterThan(array1, numberToCheck);
        boolean result2 = im.doesHaveElementGreaterThan(array2, numberToCheck);

        System.out.println("Array 1 has element greater than " + numberToCheck + ": " + result1);
        System.out.println("Array 2 has element greater than " + numberToCheck + ": " + result2);
    }
}
