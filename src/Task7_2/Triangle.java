package Task7_2;

    class Triangle extends Figure {
        double sideA, sideB, sideC;

        public Triangle(double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public double getPerimeter() {
            return sideA + sideB + sideC;
        }

        public double getArea() {
            double p = (sideA + sideB + sideC) / 2.0;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }

        public void showInfo() {
            System.out.println("Triangle with sides: " + sideA + ", " + sideB + ", " + sideC);
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("Area: " + getArea());

        }
    }

