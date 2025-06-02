package Basics;

public class IfStatementRunner {
    public static void main(String[] args) {
//        int i = 23;
//        if(i == 25){
//            System.out.println("i = 25");
//        }else if (i==24){
//            System.out.println("i = 24");
//        }else if (i==23){
//            System.out.println("i = 23");
//        }else{
//            System.out.println("i != 25 && i != 24 && i != 23");
//        }
        puzzle2();
    }

    private static void puzzle2() {

            int l = 15;
            if(l<20)
                System.out.println("l<20");
            if(l>20)
                System.out.println("l>20");
            else
                System.out.println("Who am I");
    }

    private static void puzzle1() {
        int k = 15;
        if(k>20){
            System.out.println(1);
        } else if (k>10) {
            System.out.println(2);
        } else if (k>20) {
            System.out.println(3);
        }else{
            System.out.println(4);
        }



    }
}
