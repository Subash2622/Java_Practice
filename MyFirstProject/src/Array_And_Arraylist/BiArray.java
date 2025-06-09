package Array_And_Arraylist;

public class BiArray {
    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1,int[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }
    public boolean areSumEquals(){
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        boolean areSumEqual = (sum1==sum2);
        return areSumEqual;
    }
    private int calculateSum(int[] array){
        int sum = 0;
        for(int element:array){
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 5};

        BiArray biArray = new BiArray(arr1, arr2);
        boolean result = biArray.areSumEquals();

        System.out.println("Are the sums equal? " + result);
    }
}
