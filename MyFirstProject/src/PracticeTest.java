public class PracticeTest {
    public static void main(String[] args) {
        Practice pObj = new Practice();
        Practice pObj_1 = new Practice("Subash");

        System.out.println(pObj.sayHi());
        System.out.println(pObj_1.sayHi());

        System.out.println(Practice.sayPlace());
    }
}
