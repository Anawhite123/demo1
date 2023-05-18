package Cylinder;

public class Circle {
    double radius;// instant variable

    public Circle(double radius){//constructor with one argument
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double PI = Math.PI;
       double area = radius*radius*PI;
       return area;
    }
}
