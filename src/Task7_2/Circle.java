package Task7_2;

    class Circle extends Figure {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public void showInfo() {
            System.out.println("Circle radius: " + radius);
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("Area: " + getArea());
        }
    }
