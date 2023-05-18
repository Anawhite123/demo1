package Poolarea;

public class Rectangle {
    double width;
    double length;

  public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }
}
