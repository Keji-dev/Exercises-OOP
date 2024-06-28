package Figures;

import java.util.Scanner;

public class Heron {

    private Scanner scan = new Scanner(System.in);
    private float a;
    private float b;
    private float c;
    private float area;

    public void getHeron() {
        System.out.println("Size of side a?");
        a = Float.valueOf(scan.nextLine());
        System.out.println("Size of side b?");
        b = Float.valueOf(scan.nextLine());
        System.out.println("Size of side c?");
        c = Float.valueOf(scan.nextLine());
        area = (a + b + c)/ 2;
        System.out.println("The area of the three side lengths is " + ((float) Math.sqrt(area * (area - a) * (area - b) * (area - c))));
    }

}
