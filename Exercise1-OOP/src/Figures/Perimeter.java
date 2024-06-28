package Figures;

import java.util.Scanner;

public class Perimeter {

    private Scanner scan = new Scanner(System.in);
    private float side;
    private float width;
    private float height;
    private float firstSide;
    private float secondSide;
    private float thirdSide;
    private float diameter;

    public void getPerimeterSquare() {
        System.out.println("Size of the side?");
        side = Float.valueOf(scan.nextLine());
        System.out.println("The perimeter of the square is " + (side * 4));
    }

    public void getPerimeterTriangle() {
        System.out.println("Size of the first side?");
        firstSide = Float.valueOf(scan.nextLine());
        System.out.println("Size of the second side?");
        secondSide = Float.valueOf(scan.nextLine());
        System.out.println("Size of the third side?");
        thirdSide = Float.valueOf(scan.nextLine());
        System.out.println("The perimeter of the triangle is " + (firstSide + secondSide + thirdSide));
    }

    public void getPerimeterRectangle() {

        while(true) {
            System.out.println("Size of the width?");
            width = Float.valueOf(scan.nextLine());
            System.out.println("Size of the height?");
            height = Float.valueOf(scan.nextLine());

            if (width == height) {
                System.out.println("Remember width and height can't be equal in a rectangle!");
                System.out.println();
            } else {
                System.out.println("The perimeter of the rectangle is " + (2 * (width) * 2 * (height)));
                break;
            }
        }
    }

    public void getPerimeterCircle() {
        System.out.println("Size of the radius?");
        diameter = Float.valueOf(scan.nextLine());
        System.out.println("The perimeter of the circle is " + (diameter * Math.PI));
    }
}
