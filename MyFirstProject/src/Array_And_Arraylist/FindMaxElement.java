package Array_And_Arraylist;

public class FindMaxElement {
    public static void main(String[] args) {
        int [] arr = {29,43,89,10,44};
        int max = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number -> "+max);
    }
}
