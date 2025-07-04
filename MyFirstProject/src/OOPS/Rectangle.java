package OOPS;

public class Rectangle {
    //State
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return length * width;
    }

    public int perimeter(){
        return 2*(length + width);
    }
    //Creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //Operation

    public String toString(){
        return String.format("length - %d width - %d area %d - perimeter - %d", length, width, area(), perimeter());
    }

}
