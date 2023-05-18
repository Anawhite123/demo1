package Cylinder;

public class mainMethod {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);//object as method is instant
        System.out.println("circle.radius= "+circle.getRadius());
        System.out.println("circle.area= "+circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);//object creation and assign the value
        System.out.println("cylinder.radius= "+cylinder.getRadius());
        System.out.println("cylinder.height= "+cylinder.getHeight());
        System.out.println("cylinder.area=" +cylinder.getArea());
        System.out.println("cylinder.volume=" +cylinder.getVolume());
    }
}
