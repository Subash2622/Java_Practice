package Array_And_Arraylist;

public class Variable_Arguments_Example {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5,6,7,8));
    }
    static int sum(int... values){
        int sum = 0;
        for(int value:values){
            sum += value;
        }
        return sum;
    }
}
