package geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(4.5, 5.5);

        System.out.println("Enter rec1's width : ");
        double rec1Width = scanner.nextDouble();
        System.out.println("Enter rec1's height : ");
        double rec1Height = scanner.nextDouble();

        rec1.setHeight(rec1Height);
        rec1.setWidth(rec1Width);

        System.out.printf(rec1.display());
        System.out.printf("\nrec1: area = %.2f ; perimeter = %.2f\n", rec1.getArea(), rec1.getPerimeter());
        System.out.printf(rec2.display());
        System.out.printf("\nrec2: area = %.2f ; perimeter = %.2f", rec2.getArea(), rec2.getPerimeter());


    }
}
