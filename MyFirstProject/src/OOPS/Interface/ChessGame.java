package OOPS.Interface;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Move this Up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {
        System.out.println("Move to left");
    }

    @Override
    public void right() {
        System.out.println("Move right");
    }
}
