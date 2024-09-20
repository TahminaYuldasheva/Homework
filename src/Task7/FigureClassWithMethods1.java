package Task7;

 abstract class Figure {

    abstract double getPerimeter();

    abstract double getArea();

    void showInfo() {
        System.out.println("This is a figure");
    }
}

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



