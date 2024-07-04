import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(manager, scan);
        ui.start();
    }
}
