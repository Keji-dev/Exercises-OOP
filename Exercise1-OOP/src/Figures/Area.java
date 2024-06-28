package Figures;

import java.util.Scanner;

public class Area {

    private Scanner scan = new Scanner(System.in);
    private float side;
    private float width;
    private float height;
    private float radius;

    public void getAreaSquare() {
            System.out.println("Size of the side?");
            side = Float.valueOf(scan.nextLine());
            System.out.println("The area of the square is " + (side * side));
    }

    public void getAreaTriangle() {
        System.out.println("Size of the width?");
        width = Float.valueOf(scan.nextLine());
        System.out.println("Size of the height?");
        height = Float.valueOf(scan.nextLine());
        System.out.println("The area of the triangle is " + (width * height) / 2);
    }

    public void getAreaRectangle() {
        while (true) {
            System.out.println("Size of the width?");
            width = Float.valueOf(scan.nextLine());
            System.out.println("Size of the height?");
            height = Float.valueOf(scan.nextLine());
            if (width == height) {
                System.out.println("Remember width and height can't be equal in a rectangle!");
                System.out.println();
            } else {
                System.out.println("The area of the rectangle is " + (width * height));
                break;
            }
        }
    }

    public void getAreaCircle() {
        System.out.println("Size of the radius?");
        radius = Float.valueOf(scan.nextLine());
        System.out.println("The area of the circle is " + ((float) Math.PI * (radius * radius)));
    }
}
