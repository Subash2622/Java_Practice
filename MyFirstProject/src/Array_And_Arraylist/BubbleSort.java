package Array_And_Arraylist;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {1,32,2,56,67,98,31};

        for(int i=0;i< arr.length-1;i++){
            for(int j=1;j< arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
