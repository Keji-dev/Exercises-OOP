package Main;

import Figures.Area;
import Figures.Perimeter;
import Figures.Heron;

import java.util.Scanner;

public class RunMenu {

    private Menu menu = new Menu();
    private Area area = new Area();
    private Perimeter perimeter = new Perimeter();
    private Heron heron = new Heron();

    public void fullMenu() {
        Scanner scan = new Scanner(System.in);
        Perimeter perimeter = new Perimeter();

        while (true){
            menu.mainMenu();
            try {
                int input = Integer.valueOf(scan.nextLine());


                if (input == 1) {
                    while (true) {
                        menu.areaMenu();
                        input = Integer.valueOf(scan.nextLine());

                        if (input == 1) {
                            area.getAreaSquare();
                        }

                        if (input == 2) {
                            area.getAreaCircle();
                        }

                        if (input == 3) {
                            area.getAreaRectangle();
                        }

                        if (input == 4) {
                            area.getAreaTriangle();
                        }

                        if (input == 5) {
                            break;
                        } else {
                            continue;
                        }
                    }

                } else if (input == 2) {
                    while(true) {
                        menu.perimeterMenu();
                        input = Integer.valueOf(scan.nextLine());

                        if (input == 1) {
                            perimeter.getPerimeterSquare();
                        }

                        if (input == 2) {
                            perimeter.getPerimeterCircle();
                        }

                        if (input == 3) {
                            perimeter.getPerimeterRectangle();
                        }

                        if (input == 4) {
                            perimeter.getPerimeterTriangle();
                        }

                        if (input == 5){
                            break;
                        } else {
                            continue;
                        }
                    }
                } else if (input == 3) {
                    while(true) {
                        menu.heronMenu();
                        input = Integer.valueOf(scan.nextLine());

                        if (input == 1) {
                            heron.getHeron();
                        }

                        if (input == 2) {
                            break;
                        } else {
                            continue;
                        }
                    }

                } else if (input == 4) {
                    break;
                } else {
                    continue;
                }
            } catch (Exception e) {
                System.out.println("You can only enter the numbers in the menu.");
            }
        }
    }
}
