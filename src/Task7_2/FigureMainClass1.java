package Task7_2;

import java.util.Random;

public class FigureMainClass1 {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length; i++) {
            int figureType = random.nextInt(3);
            switch (figureType) {
                case 0:
                    double sideA = random.nextDouble(1,10);
                    double sideB = random.nextDouble(1,10);
                    double sideC = 3 + random.nextInt(1,10) ;
                    if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                        figures[i] = new Triangle(sideA, sideB, sideC);
                    } else {
                        i--;
                    }
                    break;
                case 1:
                    double width = random.nextDouble(1,10);
                    double length = random.nextDouble(1,10);
                    figures[i] = new Rectangle(width, length);
                    break;
                case 2:
                    double radius = random.nextDouble(1,10);  // радиус от 3 до 10
                    figures[i] = new Circle(radius);
                    break;
            }
        }


        double totalPerimeter = 0;
        double totalArea = 0;

        for (Figure figure : figures) {
            figure.showInfo();
            System.out.println();
            totalPerimeter += figure.getPerimeter();
            totalArea += figure.getArea();
        }

        System.out.println("Total perimeter of all figures: " + totalPerimeter);
        System.out.println("Total area of all figures: " + totalArea);
    }


    }

