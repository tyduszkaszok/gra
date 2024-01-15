import java.util.ArrayList;
public class Logic {
    private ArrayList playerX = new ArrayList<>();
    private ArrayList playerY = new ArrayList<>();

    private int[][] board = new int[3][3];

    private boolean closeGame = false;

    private String winner;

    public Logic() {
    };

    public void addCross(int row, int column) {
        if ((row >= 1 && row <= 3) && (column >= 1 && column <= 3) && isValidMove(row, column)) {
            this.board[row - 1][column - 1] = 1;

        }
        else
        {
            System.out.print("Nieprawidłowy ruch!");
        }
    }

    public void addCircle(int row, int column) {
        if ((row >= 1 && row <= 3) && (column >= 1 && column <= 3) && isValidMove(row, column)) {
            this.board[row - 1][column - 1] = 0;
        }
        else
        {
            System.out.print("Nieprawidłowy ruch!");
        }
    }

    private boolean isValidMove(int row, int column) {
        if ((row >= 1 && row <= 3) && (column >= 1 && column <= 3)) {
            return board[row - 1][column - 1] == 0;
        }
        return false;
    }
    public void checkBoard()
    {
        checkRows();
        checkColumns();
        checkDiagonalL();
        checkDiagonalR();
    }

    private void checkDiagonalR() {
        int firstValue = board[0][0];
        boolean isSame = true;
        for (int i = 1; i < 3; i++) {
            if (board[i][i] != firstValue) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            setCloseGame();
            setWinner(2, 2);
        }
    }

    private void checkDiagonalL() {
        int firstValue = board[0][2];
        boolean isSame = true;
        for (int i = 1; i >= 0; i--) {
            if (board[i][2 - i] != firstValue) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            setCloseGame();
            setWinner(0, 0);
        }
    }
    private void checkRows() {
        for (int i = 0; i < 3; i++) {
            int firstValue = board[i][0];
            boolean isSame = true;

            for (int j = 1; j < 3; j++) {
                if (board[i][j] != firstValue) {
                    isSame = false;
                    break;
                }
            }
            if(isSame)
            {
                setCloseGame();
                setWinner(i, 0);
            }
        }
    }

    private void checkColumns() {
        for (int j = 0; j < 3; j++) {
            int firstValue = board[0][j];
            boolean isSame = true;

            for (int i = 1; i < 3; i++) {
                if (board[i][j] != firstValue) {
                    isSame = false;
                    break;
                }
            }
            if(isSame)
            {
                setCloseGame();
                setWinner(0, j);
            }
        }
    }
    private void setWinner(int i, int j)
    {
        if(board[i][j]==1)
        {
            setWinner("Player1 (X)");
//            System.out.print("Wygrał gracz1");
        }
        else
        {
            setWinner("Player2 (O)");
//            System.out.print("Wygrał gracz2");
        }
    }

    public void setCloseGame() {
        closeGame = true;
    }

    public boolean getCloseGame() {
        return closeGame;
    }

    public String getWinner()
    {
        return winner;
    }

    private void setWinner(String winner)
    {
        this.winner=winner;

    }

}
