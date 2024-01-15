import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        GUIView guiView = new GUIView();
        guiView.display();
        Scanner scanner = new Scanner(System.in);

        Logic logic = new Logic();
        Console console = new Console();

        while (true) {
            console.display1(true);
            String row = scanner.nextLine();
            int intRow = Integer.parseInt(row);
            String column = scanner.nextLine();
            int intColumn = Integer.parseInt(column);
            logic.addCross(intRow, intColumn);
            logic.checkBoard();

            if (logic.getCloseGame()) { //getCloseGame() jakieś problemy generuje
                break;
            }

            console.display2(true);
            row = scanner.nextLine();
            intRow = Integer.parseInt(row);
            column = scanner.nextLine();
            intColumn = Integer.parseInt(column);
            logic.addCircle(intRow, intColumn);
            logic.checkBoard();

            if (logic.getCloseGame()) {
                break;
            }
        }
    }
}
