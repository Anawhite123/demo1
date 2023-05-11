//Wall Area
//        Write a class with the name Wall. The class needs two fields(instance variables) with name width
//        and height of type double.
//        The class needs to have two constructors. The first constructor does not have any parameters (no-arg
//        constructor). The second constructor has parameters width and height of type double and it needs to
//        initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
//        height parameter is less than 0 it needs to set the height field value to 0.
//        Write the following methods(instance methods):
//        * Method named getWidth without any parameters, it needs to return the value of width field.
//        * Method named getHeight without any parameters, it needs to return the value of height field.
//        * Method named setWidth with one parameter of type double, it needs to set the value of the width
//        field. If the parameter is lessthan 0 it needs to set the width field value to 0.
//        * Method named setHeight with one parameter of type double, it needs to set the value of the
//        height field. If the parameter is lessthan 0 it needs to set the height field value to 0.
//        * Method named getArea without any parameters, it needs to return the area of the wall.
//        TEST EXAMPLE
//        → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
//        Wall wall = new Wall (5, 4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());



public class Wall {

    double width;
    double height;

    double wallarea = width * height;

    public Wall() {
    }//no argument constructor

    public Wall(double height, double width) { // constructor with argu
        this.height = 4;
        this.width = 5;

    }

    public void walldetails() {
        System.out.println(height);
        System.out.println(width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {

        return height;
    }

    public double setWidth(double a) {
        if (a < 0) {
            width = 0;
        }
        return a;
    }

    public double setHeight(double b) {
        if (b < 0) {
            height = 0;
        }
        return b;
    }

    public double getArea() {
        return height * width;
    }

    //wall.walldetails();
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
//






