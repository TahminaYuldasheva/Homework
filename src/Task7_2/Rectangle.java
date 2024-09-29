package Task7_2;

    class Rectangle extends Figure {
        double width;
        double length;


        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }

        public double getArea() {
            return width * length;
        }

        public void showInfo() {
            System.out.println("Rectangle with width " + width + " and length " + length);
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("Area: " + getArea());
        }
    }

