package abstractexample23;

class TestAbstraction1 {
    public static void main(String[] args) {// calling data from the abstratc class
        Shape s = new Circle1() {
            @Override
            public void draw() {

            }
        };

                s.draw();
            }


        }



