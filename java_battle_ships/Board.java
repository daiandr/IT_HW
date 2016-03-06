package Ships;


public class Board {

    public static final int BOARD_SIZE = 7;
    private int[][] board;

    Board() {
        this.board = new int[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = 0;
            }
        }
    }

    void printBoard() {
        System.out.println("   0 1 2 3 4 5 6");
        System.out.println("   -------------");
        for (int row = 0; row < BOARD_SIZE; row++) {
            int rowNum = row;
            System.out.print(rowNum + "| ");
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }


    public void setBoardElement(int row, int col, int val) {
        if (val >= 0) {
            this.board[row][col] = val;
        }
    }

    int getBoardElement(int row, int col) {
        return this.board[row][col];
    }

    public int[][] getBoard() {
        return board;
    }
}
