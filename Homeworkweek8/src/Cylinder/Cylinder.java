package Cylinder;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double height){// constructor with two arguments
        super(radius);// use of previous class constructor, we have use super key word.//super(variable);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double volume= getArea()*height;
        return volume;
    }
}
